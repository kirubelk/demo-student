package edu.mum.cs.cs425.demo.service;

import java.util.List;

import edu.mum.cs.cs425.demo.model.ClassRoom;
import edu.mum.cs.cs425.demo.model.Student;

public interface IStudentService {
    
    Student saveStudent(Student student);
    List<Student> getAllStudent();
    List<Student> getPassingStudentsOnly();
    //List<Student> getLatestStudents();
    Student getStudentById(long id);
    void updateStudent(ClassRoom classRoom, long studentId);
    
}