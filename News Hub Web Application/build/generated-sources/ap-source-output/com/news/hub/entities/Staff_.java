package com.news.hub.entities;

import com.news.hub.entities.Notification;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-10-25T13:47:32")
@StaticMetamodel(Staff.class)
public class Staff_ extends SystemUser_ {

    public static volatile SingularAttribute<Staff, String> occupation;
    public static volatile SingularAttribute<Staff, Long> staffNumber;
    public static volatile ListAttribute<Staff, Notification> notifications;
    public static volatile SingularAttribute<Staff, String> faculty;

}