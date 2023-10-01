package com.news.hub.dao;

import com.news.hub.entity.mail.Email;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DXgriz
 */
@Stateless
public class EmailFacade extends AbstractFacade<Email> implements EmailFacadeLocal {

    @PersistenceContext(unitName = "News_Hub_Web_ApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmailFacade() {
        super(Email.class);
    }
    
}
