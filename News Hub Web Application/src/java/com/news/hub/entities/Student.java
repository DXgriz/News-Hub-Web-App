/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author andil
 */
@Entity
public class Student extends SystemUser implements Serializable 
{
    private Long studentNumber;
    
    private Integer studyLevel;
    @OneToOne
    @JoinTable(name="userCourse")
    private Course course;
    
    @OneToMany
    @JoinTable(name="userNotifications")
    private List<Notification> notifications;

    public Student() {
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getStudyLevel() {
        return studyLevel;
    }

    public void setStudyLevel(Integer studyLevel) {
        this.studyLevel = studyLevel;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
    
    
    
    

}
