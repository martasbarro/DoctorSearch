package com.practica5.DoctorSearch;

import java.util.Objects;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Pattern(message="Invalid email", regexp="^[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,4}$")
    private String email;

    @Pattern(message="Username must only contain letters or numbers and be between 3 and 20 characters" , regexp="^[a-zA-Z-.0-9]{3,20}$")
    private String username;

    @Pattern(message = "Password must only contain letters or numbers and be between 3 and 20 characters", regexp="^[a-zA-Z-.0-9]{3,20}$")
    private String password;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return username.equals(that.username);
    }

    @Override
    public int hashCode(){
        return Objects.hash(username);
    }
    
}
