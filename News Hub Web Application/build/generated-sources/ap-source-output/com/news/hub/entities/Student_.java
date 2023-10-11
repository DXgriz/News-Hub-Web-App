package com.news.hub.entities;

import com.news.hub.entities.Course;
import com.news.hub.entities.Notification;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-10-11T14:54:17")
@StaticMetamodel(Student.class)
public class Student_ extends SystemUser_ {

    public static volatile SingularAttribute<Student, Long> studentNumber;
    public static volatile SingularAttribute<Student, Course> course;
    public static volatile SingularAttribute<Student, Integer> studyLevel;
    public static volatile ListAttribute<Student, Notification> notifications;

}