package com.practica5.DoctorSearch;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{
    
    public List<User> getUsers()
    {
        return List.of(
            /*new User("Paciente1", "Paciente1"),
                new User("Paciente2", "Paciente2"),
                new User("Paciente3", "Paciente3"),
                new User("Paciente4", "Paciente4"),
                new User("Paciente5", "Paciente5")*/
            new User("paciente1@doctorsearch.com","Paciente1", "Paciente1"),
            new User("paciente2@doctorsearch.com","Paciente2", "Paciente2"),
            new User("paciente3@doctorsearch.com","Paciente3", "Paciente3"),
            new User("paciente4@doctorsearch.com","Paciente4", "Paciente4"),
            new User("paciente5@doctorsearch.com","Paciente5", "Paciente5")
        );
    }
}

