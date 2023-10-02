package com.news.hub.dao;

import com.news.hub.entity.mail.Email;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DXgriz
 */
@Local
public interface EmailFacadeLocal {

    void create(Email email);

    void edit(Email email);

    void remove(Email email);

    Email find(Object id);

    List<Email> findAll();

    List<Email> findRange(int[] range);

    int count();
    
}
