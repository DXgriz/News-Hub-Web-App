package com.news.hub.session;

import com.news.hub.entities.Administrator;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DXgriz
 */
@Local
public interface AdmininstratorFacadeLocal {

    void create(Administrator admininstrator);

    void edit(Administrator admininstrator);

    void remove(Administrator admininstrator);

    Administrator find(Object id);

    List<Administrator> findAll();

    List<Administrator> findRange(int[] range);

    int count();
    
}
