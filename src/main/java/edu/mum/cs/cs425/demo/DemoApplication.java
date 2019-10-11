package edu.mum.cs.cs425.demo;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.demo.model.ClassRoom;
import edu.mum.cs.cs425.demo.model.Course;
import edu.mum.cs.cs425.demo.model.Student;
import edu.mum.cs.cs425.demo.model.Transcript;
import edu.mum.cs.cs425.demo.repository.StudentRepository;
import edu.mum.cs.cs425.demo.service.IClassRoomService;
import edu.mum.cs.cs425.demo.service.ICourseService;
import edu.mum.cs.cs425.demo.service.IStudentService;
import edu.mum.cs.cs425.demo.service.ITranscriptService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


	@Autowired
	private IStudentService studentService;
	@Autowired
	private ITranscriptService transcriptService;
	@Autowired
	private ICourseService courseService;
	@Autowired 
	private IClassRoomService classRoomService;


	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	public Student createNewStudent(Student[] stud){
		for (Student var : stud) {
			Transcript tarns = transcriptService.saveTranscript(var.getTranscript());
			return tarns.getStudent();
		}
		return null;
	}

	private void createClassRoom(ClassRoom[] classRooms){
		for (ClassRoom var : classRooms) {
			classRoomService.saveClassRoon(var);
		}

	}

	private void createCourse(Course[] courses){
		for (Course var : courses) {
			courseService.saveCourse(var);
		}
	}


	@Override
	public void run(String... args) throws Exception {

		ClassRoom cr1 = new ClassRoom("McLaughlin building", "M105");
        ClassRoom cr2 = new ClassRoom("Verrill Hall", "V29");
		ClassRoom cr3 = new ClassRoom("Dreier Building", "#3");
		
		Course c1 = new Course("FPP", "CS390", 4.0f);
        Course c2 = new Course("MPP", "CS401", 4.0f);
		Course c3 = new Course("SWE", "CS425", 4.0f);
		
		Transcript tr1 = new Transcript("BS Computer Science");
        Transcript tr2 = new Transcript("MS Computer Science");
        Transcript tr3 = new Transcript("BS Mathematics");
        Transcript tr4 = new Transcript("PhD Vedic Science");
        Transcript tr5 = new Transcript("MA Film Production");

        // Create 5 new students
        Student s1 = new Student(980001L, "John","A. Smith","A. Smith", 3.94f, LocalDate.of(2018, 10, 24),tr1);
        Student s2 = new Student(980002L, "Anna", "Marie", "Jones", 3.05f, LocalDate.of(2019, 3, 15),tr2);
        Student s3 = new Student(980003L, "Peter", "Harrington", "done", 2.90f, LocalDate.of(2018, 10, 24),tr3);
        Student s4 = new Student(980004L, "Ducarmel", "R. Saint", "Jean", 3.77f, LocalDate.of(2018, 10, 24),tr4);
		Student s5 = new Student(980005L, "Mary", "Washington", "Done", 3.26f, LocalDate.of(2019, 3, 13),tr5);
		
		tr1.setStudent(s1);
		tr2.setStudent(s2);
        tr3.setStudent(s3);
        tr4.setStudent(s4);
		tr5.setStudent(s5);
		
		
        ClassRoom[] classrooms = {cr1, cr2, cr3};
		Student[] students = {s1,s2,s3,s4,s5};
		Course[] courses = {c1, c2, c3};


		createNewStudent(students);
		createCourse(courses);
		createClassRoom(classrooms);

	}

}
