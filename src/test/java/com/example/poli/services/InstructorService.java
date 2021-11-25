package com.example.poli.services;


import com.example.poli.entities.Instructor;

import java.util.List;

public interface InstructorService {

    List<Instructor> findAll();
    Instructor create(Instructor instructor);

}
