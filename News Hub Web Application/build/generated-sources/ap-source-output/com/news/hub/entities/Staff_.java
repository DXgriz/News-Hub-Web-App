package com.news.hub.entities;

import com.news.hub.entities.Notification;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-11-01T09:26:09")
@StaticMetamodel(Staff.class)
public class Staff_ extends SystemUser_ {

    public static volatile SingularAttribute<Staff, String> occupation;
    public static volatile SingularAttribute<Staff, Long> staffNumber;
    public static volatile ListAttribute<Staff, Notification> notifications;
    public static volatile SingularAttribute<Staff, String> faculty;

}