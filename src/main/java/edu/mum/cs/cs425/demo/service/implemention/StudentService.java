package edu.mum.cs.cs425.demo.service.implemention;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.demo.model.ClassRoom;
import edu.mum.cs.cs425.demo.model.Student;
import edu.mum.cs.cs425.demo.repository.StudentRepository;
import edu.mum.cs.cs425.demo.service.IStudentService;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public List<Student> getPassingStudentsOnly() {
        return studentRepo.findStudentsWithCgpaGreaterThan3(3.0f);
    }

    // @Override
    // public List<Student> getLatestStudents() {

    //     return studentRepo.findStudentsByStudentNumberGreaterThan(610172L);
    // }

    @Override
    public Student getStudentById(long id) {
        return studentRepo.findById(id).orElse(null);
    }

    @Override
    public void updateStudent(ClassRoom classRoom, long studentId) {
        studentRepo.update(classRoom, studentId);
    }
    
}