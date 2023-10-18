package com.news.hub.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 *
 * @author andil
 */
@Entity
public class Email implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;

    private String subjectLine;
    
    private SystemUser sender;
    @OneToMany
    @JoinTable(name = "email_recipients")
    private List<SystemUser> recipient;
    
    private byte[] fileAttachment;
    
    private byte[] content;

    public Email() {
    }

    public Long getEmailId() {
        return emailId;
    }

    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }

    public String getSubjectLine() {
        return subjectLine;
    }

    public void setSubjectLine(String subjectLine) {
        this.subjectLine = subjectLine;
    }
    
    public SystemUser getSender() {
        return sender;
    }

    public void setSender(SystemUser sender) {
        this.sender = sender;
    }

    public List<SystemUser> getRecipient() {
        return recipient;
    }

    public void setRecipient(List<SystemUser> recipient) {
        this.recipient = recipient;
    }

    public byte[] getFileAttachment() {
        return fileAttachment;
    }

    public void setFileAttachment(byte[] fileAttachment) {
        this.fileAttachment = fileAttachment;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
    
    
    
}
