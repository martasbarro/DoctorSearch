package com.practica5.DoctorSearch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private String idHospital;
    private String name;
    private String speciality;
    private double rate;
    private String email;
    private String photo;
}
