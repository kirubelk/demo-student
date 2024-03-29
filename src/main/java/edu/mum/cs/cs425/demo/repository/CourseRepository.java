package edu.mum.cs.cs425.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.demo.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    
}