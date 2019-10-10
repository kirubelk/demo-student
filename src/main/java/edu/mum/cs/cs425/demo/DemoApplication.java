package edu.mum.cs.cs425.demo;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.demo.model.Student;
import edu.mum.cs.cs425.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


	@Autowired
	private StudentRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	void saveStudent(){
		Student stu  = new Student();
		stu.setStudentId(000-61-0001L);
		stu.setFirstName("Anna");
		stu.setMiddleName("Lynn");
		stu.setLastName("Smith");
		stu.setCgpa(3.45f);
		//stu.setDateOfEnrollment(New ;
		repo.save(stu);

	}

	@Override
	public void run(String... args) throws Exception {
		saveStudent();

	}

}
