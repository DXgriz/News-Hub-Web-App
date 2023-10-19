package com.news.hub.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author vuyan
 */
@Entity
public class SupportTicket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String loggerEmailAddress;
    private byte[] query;
    private String priority;
    
    

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
        if (!(object instanceof SupportTicket)) {
            return false;
        }
        SupportTicket other = (SupportTicket) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.news.hub.entities.SupportTicket[ id=" + id + " ]";
    }

    public String getLoggerEmailAddress() {
        return loggerEmailAddress;
    }

    public void setLoggerEmailAddress(String loggerEmailAddress) {
        this.loggerEmailAddress = loggerEmailAddress;
    }

    public byte[] getQuery() {
        return query;
    }

    public void setQuery(byte[] query) {
        this.query = query;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
}
