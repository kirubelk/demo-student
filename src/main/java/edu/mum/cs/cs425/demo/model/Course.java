package edu.mum.cs.cs425.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private int courseId;

    @Column(name = "course_code")
    private String courseCode;

    @Column(name = "course_name")
    private String name;

    @Column(name = "number_of_units")
    private float numberOfUnits;


    @ManyToMany(mappedBy = "courseList")
    private List<Student> studentList;

    public Course(String name, String courseCode, float numberOfUnits){
        this.name = name;
        this.courseCode = courseCode;
        this.numberOfUnits = numberOfUnits;
    }

    public Course(String name, String courseCode, float numberOfUnits, List<Student> studentList){
        this.name = name;
        this.courseCode = courseCode;
        this.numberOfUnits = numberOfUnits;
        this.studentList = studentList;
    }

    /**
     * @return int return the courseId
     */
    public int getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    /**
     * @return String return the courseCode
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * @param courseCode the courseCode to set
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return float return the numberOfUnits
     */
    public float getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * @param numberOfUnits the numberOfUnits to set
     */
    public void setNumberOfUnits(float numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    /**
     * @return List<Student> return the studentList
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * @param studentList the studentList to set
     */
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

}