package com.practica5.DoctorSearch;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    public List<Doctor> getDoctors(){
        return List.of(
            new Doctor("111","Juan Francisco González Sánchez",  "Dermatología", 3.2, "jfgonzalez@doctorsearch.com", "https://images.vexels.com/media/users/3/144185/isolated/preview/a9075b02366ea61e8995f8d5b08d0267-flat-doctor-cartoon-by-vexels.png"),
            new Doctor("222","Emilia del Castro Gutiérrez",  "Odontología", 4.7, "edelcastro@doctorsearch.com","https://images.vexels.com/media/users/3/144177/isolated/preview/ff9a47567e4fdc2c04392e6ba040efa1-doctor-female-character-by-vexels.png"),
            new Doctor("111","Tamara del Prado",  "Pediatría", 4.0, "tdelprado@doctorsearch.com", "https://lh3.googleusercontent.com/proxy/J3xE0yikG43ct0WlTNMH-BomhyGdwhU5L6ZrSWkc1x8Wxpi9tM749zB-5JbNzxlvHe-XLtzARLaCzh5s_YoLRUUEQ9BJBZgdfFJM67W3LMqhCqK-j-rz"),
            new Doctor("444","Carlos Pepiñudo Lago",  "Neumología", 3.8,"cpepinudo@doctorsearch.com", "https://e7.pngegg.com/pngimages/162/230/png-clipart-doctor-cartoon-physician-drawing-the-bearded-doctor-child-people.png"),
            new Doctor("444","Maria Cristina de los Santos",  "Alergología", 4.1, "mcdelossantos@doctorsearch.com","https://images.vexels.com/media/users/3/144164/isolated/preview/0e3018fdabc56c12af8253ccaa59176a-badge-doctor-character-by-vexels.png"),
            new Doctor("666","Jose Carlos Muñoz Sebastián",  "Cirugía", 3.9, "jcmunoz@doctorsearch.com","https://images.vexels.com/media/users/3/144176/isolated/preview/15cd616a59014bfa7bcebb2137876a63-doctor-character-man-by-vexels.png"),
            new Doctor("222","Maria Luisa García Gijón",  "Cardiología", 3.9, "mlgarcia@doctorsearch.com", "https://www.pngkey.com/png/full/196-1960872_doctors-clipart-doctor-patient-see-doctor-png.png"),
            new Doctor("777","Ignacio Pérez del Río",  "Pediatría", 4.5, "iperez@doctorsearch.com", "https://www.pinclipart.com/picdir/middle/372-3726959_minnesota-timberwolves-clipart-doctor-surgeon-icon-png-transparent.png"),
            new Doctor("666","Penélope Cross Lambert",  "Gastroenterología", 4.8, "pcross@doctorsearch.com", "https://www.svgrepo.com/show/284195/surgeon-doctor.svg"),
            new Doctor("555","Jaime Ignacio López Cobos",  "Hepatología", 3.9, "jilopez@doctorsearch.com", "https://image.freepik.com/free-vector/doctor-icon-avatar-white_136162-58.jpg"),
            new Doctor("444","Marta Saona Rodríguez",  "Geriatría", 5, "msaona@doctorsearch.com", "https://image.freepik.com/free-vector/medical-doctor-woman-cartoon-icon_24908-22108.jpg"),
            new Doctor("333","Carla Álvarez Nuño",  "Estomatología", 4.9, "calvarez@doctorsearch.com","http://www.dentistifs.it/wp-content/uploads/2017/11/odontoiatra_1.jpg"),
            new Doctor("222","Salvador Blanco Vaca",  "Hepatología", 4.5, "sblanco@doctorsearch.com", "https://cdn1.vectorstock.com/i/1000x1000/14/80/doctor-web-icon-therapist-avatar-vector-18531480.jpg"),
            new Doctor("777","Roberta Bombín Gómez",  "Alergología", 4.3, "rbombin@doctorsearch.com","https://cdn2.vectorstock.com/i/1000x1000/87/26/flat-cartoon-icon-design-vector-17868726.jpg")
        );
    }
}
