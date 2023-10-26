package com.news.hub.session;

import com.news.hub.entities.SupportTicket;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DXgriz
 */
@Stateless
public class SupportTicketFacade extends AbstractFacade<SupportTicket> implements SupportTicketFacadeLocal {

    @PersistenceContext(unitName = "News_Hub_Web_ApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SupportTicketFacade() {
        super(SupportTicket.class);
    }
    
}
