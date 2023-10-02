package com.news.hub.entity.mail;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author DXgriz
 */
@Entity
public class Email implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String sender;
    private List<String> receipients;
    private String subject;
    private String body;
    private List<Integer> attachments;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date composedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Email)) {
            return false;
        }
        Email other = (Email) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.news.hub.mail.Email[ id=" + id + " ]";
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public List<String> getReceipients() {
        return receipients;
    }

    public void setReceipients(List<String> receipients) {
        this.receipients = receipients;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Integer> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Integer> attachments) {
        this.attachments = attachments;
    }

    public Date getComposedDate() {
        return composedDate;
    }

    public void setComposedDate(Date composedDate) {
        this.composedDate = composedDate;
    }
    
}
