package com.news.hub.dao;

import com.news.hub.entity.staff.Staff;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DXgriz
 */
@Local
public interface StaffFacadeLocal {

    void create(Staff staff);

    void edit(Staff staff);

    void remove(Staff staff);

    Staff find(Object id);

    List<Staff> findAll();

    List<Staff> findRange(int[] range);

    int count();
    
}
