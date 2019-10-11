package edu.mum.cs.cs425.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Transcript {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transcript_id")
    private Long transcriptId;

    @Column(name = "degree_title")
    private String degreeTitle;

    @OneToOne(mappedBy = "transcript", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Student student;
    

    public Transcript(String degreeTitle){
        this.degreeTitle = degreeTitle;
    }
    
    public Transcript(String degreeTitle, Student student){
        this.degreeTitle = degreeTitle;
        this.student = student;
    }

    public Transcript (Long transcriptId, String degreeTitle, Student student){
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;
        this.student = student;
    }


    /**
     * @return Long return the transcriptId
     */
    public Long getTranscriptId() {
        return transcriptId;
    }

    /**
     * @param transcriptId the transcriptId to set
     */
    public void setTranscriptId(Long transcriptId) {
        this.transcriptId = transcriptId;
    }

    /**
     * @return String return the degreeTitle
     */
    public String getDegreeTitle() {
        return degreeTitle;
    }

    /**
     * @param degreeTitle the degreeTitle to set
     */
    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    /**
     * @return Student return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

}