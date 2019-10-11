package edu.mum.cs.cs425.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.demo.model.ClassRoom;
import edu.mum.cs.cs425.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value="select s from Student s where s.cgpa >= ?1 order by s.first_name", nativeQuery = true)
    List<Student> findStudentsWithCgpaGreaterThan3(float cgpa);

    //List<Student> findStudentsByStudentNumberGreaterThan(long studentId);

    @Modifying
    @Query(value="update Student s set s.classroom = ?1 where s.studentId = ?2", nativeQuery = true)
    void update(ClassRoom classroom, long id);
    
}