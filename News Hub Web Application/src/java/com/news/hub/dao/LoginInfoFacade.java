package com.news.hub.dao;

import com.news.hub.entity.data.LoginInfo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DXgriz
 */
@Stateless
public class LoginInfoFacade extends AbstractFacade<LoginInfo> implements LoginInfoFacadeLocal {

    @PersistenceContext(unitName = "News_Hub_Web_ApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LoginInfoFacade() {
        super(LoginInfo.class);
    }
    
}
