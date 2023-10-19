package com.news.hub.entities;

import com.news.hub.entities.Course;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-10-19T14:18:29")
@StaticMetamodel(Student.class)
public class Student_ extends SystemUser_ {

    public static volatile SingularAttribute<Student, Long> studentNumber;
    public static volatile SingularAttribute<Student, Course> course;
    public static volatile SingularAttribute<Student, Integer> studyLevel;

}