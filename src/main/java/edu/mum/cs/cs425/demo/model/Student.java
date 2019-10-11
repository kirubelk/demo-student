package edu.mum.cs.cs425.demo.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Student_tabel")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "cgpa")
    private Float cgpa;

    @Column(name = "date_of_enrollment")
    private LocalDate eOfEnrollment;
    
    
    @OneToOne
    @JoinColumn(name = "transcript_id", nullable = false, unique = true)
    private Transcript transcript;

    @ManyToOne
    @JoinColumn(name = "class_room_id", nullable = true)
    private ClassRoom classRoom;

    @ManyToMany
    @JoinTable(
                name = "student_courses",
                joinColumns = {@JoinColumn(name = "student_id", referencedColumnName = "student_id")},
                inverseJoinColumns= {@JoinColumn(name = "course_id", referencedColumnName = "course_id")}
    )

    private List<Course> courseList;



    
    public Student() {
    }

    public Student(Long studentId, String firstName, String middleName, String lastName, Float cgpa, LocalDate eOfEnrollment, Transcript transcript) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.eOfEnrollment = eOfEnrollment;
        this.transcript = transcript;
    }

    public Student(Long studentId, String firstName, String middleName, String lastName, Float cgpa, LocalDate eOfEnrollment, Transcript transcript, ClassRoom classRoom) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.eOfEnrollment = eOfEnrollment;
        this.transcript = transcript;
        this.classRoom = classRoom;
    }

    public Student(Long id ,Long studentId, String firstName, String middleName, String lastName, Float cgpa, LocalDate eOfEnrollment, Transcript transcript, ClassRoom classRoom) {
        this.id = id;
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.eOfEnrollment = eOfEnrollment;
        this.transcript = transcript;
        this.classRoom = classRoom;
    }



    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return Long return the studentId
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return Float return the cgpa
     */
    public Float getCgpa() {
        return cgpa;
    }

    /**
     * @param cgpa the cgpa to set
     */
    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    /**
     * @return LocalDate return the eOfEnrollment
     */
    public LocalDate getEOfEnrollment() {
        return eOfEnrollment;
    }

    /**
     * @param eOfEnrollment the eOfEnrollment to set
     */
    public void setEOfEnrollment(LocalDate eOfEnrollment) {
        this.eOfEnrollment = eOfEnrollment;
    }

    /**
     * @return Transcript return the transcript
     */
    public Transcript getTranscript() {
        return transcript;
    }

    /**
     * @param transcript the transcript to set
     */
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * @return ClassRoom return the classRoom
     */
    public ClassRoom getClassRoom() {
        return classRoom;
    }

    /**
     * @param classRoom the classRoom to set
     */
    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    /**
     * @return List<Course> return the courseList
     */
    public List<Course> getCourseList() {
        return courseList;
    }

    /**
     * @param courseList the courseList to set
     */
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

}