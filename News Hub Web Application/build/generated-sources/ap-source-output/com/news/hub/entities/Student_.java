package com.news.hub.entities;

import com.news.hub.entities.Course;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-19T14:38:35")
@StaticMetamodel(Student.class)
public class Student_ extends SystemUser_ {

    public static volatile SingularAttribute<Student, Long> studentNumber;
    public static volatile SingularAttribute<Student, Course> course;
    public static volatile SingularAttribute<Student, Integer> studyLevel;

}