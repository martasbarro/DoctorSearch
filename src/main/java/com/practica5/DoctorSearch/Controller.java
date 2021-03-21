package com.practica5.DoctorSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private HospitalService hospitalService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private UserService userService;

    @GetMapping
    @RequestMapping(path="api/hospital")
    public List<Hospital> getHospitals() {return hospitalService.getHospitals();}

    @GetMapping
    @RequestMapping(path="api/doctors")
    public List<Doctor> getDoctors() {return doctorService.getDoctors();}

    @PostMapping(
        path = "/login",
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> login(
            @Valid @RequestBody User loginParam, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>("{\"result\" : \"KO\"}", HttpStatus.BAD_REQUEST);
        }

        for (User user : userService.getUsers()) {
            if ((user.getUsername().equals(loginParam.getUsername())) && (user.getPassword().equals(loginParam.getPassword()))) {
                return new ResponseEntity<>("{\"result\" : \"OK\"}", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("{\"result\" : \"KO\"}", HttpStatus.UNAUTHORIZED);
    }

    @PostMapping(
        path = "/register",
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> register(
            @Valid @RequestBody User registerParam, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>("{\"result\" : \"KO\"}", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("{\"result\" : \"OK\"}", HttpStatus.OK);
    }

    @PostMapping(
        path = "/contact",
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> contact(
            @Valid @RequestBody Contact contactParam, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>("{\"result\" : \"KO\"}", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("{\"result\" : \"OK\"}", HttpStatus.OK);
    }


    
}