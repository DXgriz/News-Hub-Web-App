package com.news.hub.dao;

import com.news.hub.entity.notifications.Notification;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DXgriz
 */
@Local
public interface NotificationFacadeLocal {

    void create(Notification notification);

    void edit(Notification notification);

    void remove(Notification notification);

    Notification find(Object id);

    List<Notification> findAll();

    List<Notification> findRange(int[] range);

    int count();
    
}
