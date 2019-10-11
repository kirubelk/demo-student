package edu.mum.cs.cs425.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.demo.model.ClassRoom;

@Repository
public interface ClassRommRepository extends JpaRepository<ClassRoom, Integer> {
    
}