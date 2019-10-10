package edu.mum.cs.cs425.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_tabel")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    
    private int studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private double cgpa;
    private Date dateOfEnrollment;
    

    


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
     * @return int return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
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
     * @return double return the cgpa
     */
    public double getCgpa() {
        return cgpa;
    }

    /**
     * @param cgpa the cgpa to set
     */
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    /**
     * @return Date return the dateOfEnrollment
     */
    public Date getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    /**
     * @param dateOfEnrollment the dateOfEnrollment to set
     */
    public void setDateOfEnrollment(Date dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

}