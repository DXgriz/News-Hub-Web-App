package com.news.hub.notifications;

import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-10-01T20:57:13")
@StaticMetamodel(Notification.class)
public class Notification_ { 

    public static volatile SingularAttribute<Notification, List> attachments;
    public static volatile SingularAttribute<Notification, String> composer;
    public static volatile SingularAttribute<Notification, Long> id;
    public static volatile SingularAttribute<Notification, String> body;

}