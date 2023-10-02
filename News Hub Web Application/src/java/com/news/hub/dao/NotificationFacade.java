package com.news.hub.dao;

import com.news.hub.entity.notifications.Notification;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DXgriz
 */
@Stateless
public class NotificationFacade extends AbstractFacade<Notification> implements NotificationFacadeLocal {

    @PersistenceContext(unitName = "News_Hub_Web_ApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NotificationFacade() {
        super(Notification.class);
    }
    
}
