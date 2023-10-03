package com.news.hub.dao;

import com.news.hub.entity.data.LoginInfo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DXgriz
 */
@Local
public interface LoginInfoFacadeLocal {

    void create(LoginInfo loginInfo);

    void edit(LoginInfo loginInfo);

    void remove(LoginInfo loginInfo);

    LoginInfo find(Object id);

    List<LoginInfo> findAll();

    List<LoginInfo> findRange(int[] range);

    int count();
    
}
