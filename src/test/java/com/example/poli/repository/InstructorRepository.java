package com.example.poli.repository;

import com.example.poli.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository <Instructor,Long> {
}
