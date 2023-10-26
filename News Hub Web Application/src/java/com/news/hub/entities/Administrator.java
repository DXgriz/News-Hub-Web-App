package com.news.hub.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author vuyan
 */
@Entity
public class Administrator extends SystemUser implements Serializable 
{
    private String adminEmail = "admin@newshub.com";
    private String adminPassword;

    public Administrator() {
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }
    
    


    
    

    
}
