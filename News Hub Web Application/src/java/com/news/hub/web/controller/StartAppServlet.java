package com.news.hub.web.controller;

import com.news.hub.dao.NotificationFacadeLocal;
import com.news.hub.entity.notifications.Notification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DXgriz
 */
public class StartAppServlet extends HttpServlet {

    @EJB
    private NotificationFacadeLocal notificationFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        List<Notification> notifications = new ArrayList<>();
        notifications = notificationFacade.findAll();
        
        String userType = request.getParameter("options").toString();
        
        if (userType.equalsIgnoreCase("user")) {
            response.sendRedirect("login_signup.jsp");
            
        } else if (userType.equalsIgnoreCase("guest")) {
            
            session.setAttribute("notifications", notifications);
            request.getRequestDispatcher("HomePage.jsp").forward(request, response);
        }            
    }
}
