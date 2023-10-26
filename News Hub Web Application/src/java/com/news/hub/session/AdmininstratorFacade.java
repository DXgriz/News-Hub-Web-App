package com.news.hub.session;

import com.news.hub.entities.Administrator;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DXgriz
 */
@Stateless
public class AdmininstratorFacade extends AbstractFacade<Administrator> implements AdmininstratorFacadeLocal {

    @PersistenceContext(unitName = "News_Hub_Web_ApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdmininstratorFacade() {
        super(Administrator.class);
    }
    
}
