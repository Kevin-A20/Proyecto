package com.example.poli.services;

import com.example.poli.entities.Course;

import java.util.List;

public interface CourseService {

    List<Course> findAll();
    Course create(Course course);
}
