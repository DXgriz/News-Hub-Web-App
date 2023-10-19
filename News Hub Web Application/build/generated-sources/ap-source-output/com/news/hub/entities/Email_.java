package com.news.hub.entities;

import com.news.hub.entities.SystemUser;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-19T14:38:35")
@StaticMetamodel(Email.class)
public class Email_ { 

    public static volatile SingularAttribute<Email, SystemUser> sender;
    public static volatile SingularAttribute<Email, String> subjectLine;
    public static volatile ListAttribute<Email, SystemUser> recipient;
    public static volatile SingularAttribute<Email, Long> emailId;
    public static volatile SingularAttribute<Email, byte[]> fileAttachment;
    public static volatile SingularAttribute<Email, byte[]> content;

}