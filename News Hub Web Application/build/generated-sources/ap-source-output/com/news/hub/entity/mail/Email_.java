package com.news.hub.entity.mail;

import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-10-03T16:08:15")
@StaticMetamodel(Email.class)
public class Email_ { 

    public static volatile SingularAttribute<Email, List> attachments;
    public static volatile SingularAttribute<Email, String> sender;
    public static volatile SingularAttribute<Email, List> receipients;
    public static volatile SingularAttribute<Email, String> subject;
    public static volatile SingularAttribute<Email, Long> id;
    public static volatile SingularAttribute<Email, String> body;
    public static volatile SingularAttribute<Email, Date> composedDate;

}