package edu.mum.cs.cs425.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "class_room_id")
    private int classRoom_id;
    
    @Column(name = "building_name")
    private String buildingName;

    @Column(name = "room_number")
    private String roomNumber;


    @OneToMany(mappedBy = "classRoom", cascade = CascadeType.ALL)
    private List<Student> studentList;

    public ClassRoom(String buildingName, String roomNumber){
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public ClassRoom(int classRoom_id, String buildingName, String roomNumber, List<Student> studentList){

        this.classRoom_id = classRoom_id;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        this.studentList = studentList;
    }
    
    /**
     * @return int return the classRoom_id
     */
    public int getClassRoom_id() {
        return classRoom_id;
    }

    /**
     * @param classRoom_id the classRoom_id to set
     */
    public void setClassRoom_id(int classRoom_id) {
        this.classRoom_id = classRoom_id;
    }

    /**
     * @return String return the buildingName
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * @param buildingName the buildingName to set
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * @return String return the roomNumber
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
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