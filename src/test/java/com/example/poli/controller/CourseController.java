package com.example.poli.controller;

import com.example.poli.entities.Course;
import com.example.poli.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping
    public List<Course> findAll(){
        return service.findAll();
    }
    @PostMapping
    public Course create(@RequestBody Course course){
        return service.create(course);
    }
}
