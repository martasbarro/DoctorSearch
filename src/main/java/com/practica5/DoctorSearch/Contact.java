package com.practica5.DoctorSearch;

import java.util.Objects;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    @Pattern(message="Invalid email", regexp="^[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,4}$")
    private String email;

    private String userMessage;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact that = (Contact) o;
        return email.equals(that.email);
    }

    @Override
    public int hashCode(){
        return Objects.hash(email);
    }
}
