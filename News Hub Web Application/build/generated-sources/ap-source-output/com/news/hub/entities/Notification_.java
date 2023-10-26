package com.news.hub.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-10-26T21:02:56")
@StaticMetamodel(Notification.class)
public class Notification_ { 

    public static volatile SingularAttribute<Notification, Long> notifId;
    public static volatile SingularAttribute<Notification, String> fileName;
    public static volatile SingularAttribute<Notification, byte[]> file;
    public static volatile SingularAttribute<Notification, String> subjectLine;
    public static volatile SingularAttribute<Notification, Date> creationDate;
    public static volatile SingularAttribute<Notification, byte[]> content;
    public static volatile SingularAttribute<Notification, Integer> targetLevel;

}