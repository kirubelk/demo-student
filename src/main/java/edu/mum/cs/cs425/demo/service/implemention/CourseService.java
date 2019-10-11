package edu.mum.cs.cs425.demo.service.implemention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.demo.model.Course;
import edu.mum.cs.cs425.demo.repository.CourseRepository;
import edu.mum.cs.cs425.demo.service.ICourseService;

@Service
public class CourseService implements ICourseService {

    @Autowired
    private CourseRepository courseRepo;

    @Override
    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }
    
}