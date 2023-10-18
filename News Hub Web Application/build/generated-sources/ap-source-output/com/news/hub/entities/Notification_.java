package com.news.hub.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-10-18T14:23:45")
@StaticMetamodel(Notification.class)
public class Notification_ { 

    public static volatile SingularAttribute<Notification, Long> notifId;
    public static volatile SingularAttribute<Notification, byte[]> file;
    public static volatile SingularAttribute<Notification, String> subjectLine;
    public static volatile SingularAttribute<Notification, String> content;
    public static volatile SingularAttribute<Notification, Integer> targetLevel;

}