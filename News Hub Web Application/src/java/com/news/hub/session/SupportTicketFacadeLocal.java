package com.news.hub.session;

import com.news.hub.entities.SupportTicket;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DXgriz
 */
@Local
public interface SupportTicketFacadeLocal {

    void create(SupportTicket supportTicket);

    void edit(SupportTicket supportTicket);

    void remove(SupportTicket supportTicket);

    SupportTicket find(Object id);

    List<SupportTicket> findAll();

    List<SupportTicket> findRange(int[] range);

    int count();
    
}
