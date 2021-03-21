package com.practica5.DoctorSearch;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {
    public List<Hospital> getHospitals(){
        return List.of(
            new Hospital("111","HM Hospital Universitario Madrid",  "Pl. del Conde del Valle de Súchil, 16"),
                new Hospital("222","Hospital Universitario La Paz",  "Paseo de la Castellana, 261"),
                new Hospital("333","Policlínico HM Arapiles",  "Calle de Arapiles, nº8"),
                new Hospital("444","Hospital de La Princesa",  "Calle de Diego de León, 62"),
                new Hospital("555","Hospital Universitario La Moraleja",  "Calle Arroyo de Valdevebas,5"),
                new Hospital("666","Hospital Nuestra Señora de América",  "Calle de Arturo Soria, 103"),
                new Hospital("777","Hospital de día Pío XII",  "Cuesta del Sagrado Corazón, 4")
        );
    }
}
