var x = document.getElementById("login");
var y = document.getElementById("register");
var z = document.getElementById("btn");

var doctorEmail1 = "contact@doctorsearch.com";

function register(){
    x.style.left="-400px";
    y.style.left="50px";
    z.style.left="110px";
}

function login(){
    x.style.left="50px";
    y.style.left="450px";
    z.style.left="0px";
}

function validateLogin()
    {
        try{
            var inputValue1 = document.getElementById("userLogin").value;
            var inputValue2 = document.getElementById("passwordLogin").value;
            const data = { username: inputValue1, password: inputValue2 };
            const address = '/login';
            fetch(address, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)    
                })
            .then(response => response.json())
            .then(data => {
                console.log(data);
                if(data.result == "OK"){
                    document.location.href='/home.html';   
                } else {
                    alert("Usuario y/o contraseña incorrectos");
                }
            });
        } catch(err){
            console.error(err.message);
        }
        return false;
    }

function validateRegister()
{
    try{
        var inputValue1 = document.getElementById("emailRegister").value;
        var inputValue2 = document.getElementById("userRegister").value;
        var inputValue3 = document.getElementById("passwordRegister").value;
        const data = { email: inputValue1, username: inputValue2, password: inputValue3 };
        const address = '/register';
        fetch(address, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)    
            })
        .then(response => response.json())
        .then(data => {
            console.log(data);
            if(data.result == "OK"){
                document.location.href='/home.html';   
                alert("Registrado con éxito");
            } else {
                alert("Usuario y/o contraseña incorrectos");
            }
        });
    } catch(err){
        console.error(err.message);
    }
    return false;
}

function showHospitals(arrData, div) {
    let html = '';
    arrData.forEach(element => {
        html += `<button type="button" class="btn btn-primary" style="background-color:#391cda;"onClick="getDoctors(${element.id})">`
                + `<div class="row" style="font-size:25px; margin:5px 5px;">${element.name}</div>`
                + `<div class="row" style="margin:5px 5px;">${element.address}</div>`
                +'</button>'
    });

    document.getElementById("content").innerHTML = html;
}

function getHospitals() {
    var headers = {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            };
    fetch("/api/hospital", {
            method: 'GET',
            headers: headers
        })
        .then(response => response.json())
        .then(data => {
            showHospitals(data, "content");
        });
}

function getDoctors(id){
    var headers = {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    };
    fetch("/api/doctors", {
        method: 'GET',
        headers: headers
    })
    .then(response => response.json())
    .then(data => {
        showDoctors(data, "content", id);
    });
}

function showDoctors(arrData, div, id) {
    let html = '';
    arrData.forEach(element => {
        if(element.idHospital==id){
            var drEmail=element.email;
            html += `<img src=${element.photo} alt="Admin" class="rounded-circle" width="150">`
                + '<div class="mt-3" style = "margin-bottom:20px;">'
                + `<h4><strong>${element.name}</strong></h4>`
                + `<p class="mb-1" style="font-size:25px; color:#eef1fa; text-shadow: 2px 2px black;">${element.speciality}</p>`
                + `<p class="font-size-sm" style="font-size:20px; color:#eef1fa;">Puntuación: ${element.rate}</p>`
                + `<button type="button" class="btn btn-secondary" onClick="setAddress('${drEmail}')">`
                + 'Contactar</button>'
                + '</div>'
        }else if (id==0){
            var drEmail=element.email;
            html += `<img src=${element.photo} alt="Admin" class="rounded-circle" width="150">`
                + '<div class="mt-3" style = "margin-bottom:20px;">'
                + `<h4><strong>${element.name}</strong></h4>`
                + `<p class="mb-1" style="font-size:25px; color:white; text-shadow: 2px 2px black;">${element.speciality}</p>`
                + `<p class="font-size-sm" style="font-size:20px; color:#eef1fa; background: #391cda;">Puntuación: ${element.rate}</p>`
                + '</div>'
        }
    });
    document.getElementById("divDoctors").innerHTML = html;
}

function setAddress(drEmail){
    console.log(drEmail);
    doctorEmail1=drEmail;
    console.log(doctorEmail1);
    changePage();
}

function changePage(){
    document.location.href='/contact.html';
}

function getAddress(){
    console.log(doctorEmail1)
    console.log(doctorEmail1)
    return doctorEmail1;
}

function validateMessage()
{
    console.log(document.location.href);
    try{
        var inputValue1 = document.getElementById("doctorEmail").value;
        var inputValue2 = document.getElementById("userMessage").value;
        const data = { email: inputValue1, userMessage: inputValue2 };
        console.log(data);
        const address = '/contact';
        fetch(address, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)    
            })
        .then(response => response.json())
        .then(data => {
            console.log(data);
            if(data.result == "OK"){
                document.location.href='/home.html';   
            } else {
                alert("Por favor, introduzca una dirección de email válida.");
            }
        });
    } catch(err){
        console.error(err.message);
    }
    return false;
}

