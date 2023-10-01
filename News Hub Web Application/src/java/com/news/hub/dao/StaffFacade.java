package com.news.hub.dao;

import com.news.hub.entity.staff.Staff;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DXgriz
 */
@Stateless
public class StaffFacade extends AbstractFacade<Staff> implements StaffFacadeLocal {

    @PersistenceContext(unitName = "News_Hub_Web_ApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StaffFacade() {
        super(Staff.class);
    }
    
}
