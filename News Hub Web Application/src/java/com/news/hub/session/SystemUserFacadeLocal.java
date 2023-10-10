/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.session;

import com.news.hub.entities.SystemUser;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author andil
 */
@Local
public interface SystemUserFacadeLocal {

    void create(SystemUser systemUser);

    void edit(SystemUser systemUser);

    void remove(SystemUser systemUser);

    SystemUser find(Object id);

    List<SystemUser> findAll();

    List<SystemUser> findRange(int[] range);

    int count();
    
}
