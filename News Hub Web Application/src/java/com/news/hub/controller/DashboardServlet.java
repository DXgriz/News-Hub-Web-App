/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.controller;

import com.news.hub.entities.Notification;
import com.news.hub.entities.Staff;
import com.news.hub.entities.Student;
import com.news.hub.entities.SystemUser;
import com.news.hub.session.EmailFacadeLocal;
import com.news.hub.session.NotificationFacadeLocal;
import com.news.hub.session.SystemUserFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author andil
 */
public class DashboardServlet extends HttpServlet {

    @EJB
    private NotificationFacadeLocal notificationFacade;

    @EJB
    private SystemUserFacadeLocal systemUserFacade;
    

    @EJB
    private EmailFacadeLocal emailFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DashboardServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DashboardServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        SystemUser user = (SystemUser)session.getAttribute("user");
        
        if(user instanceof Staff)
        {
            //TODO: Get all information realated to staff and redirect to Staff dashbboard 
        }
        else if(user instanceof Student)
        {
            //TODO: Get all information realated to student and redirect to Student dashbboard
            
            List<Notification> studentNotifications = getStudentNotofications(notificationFacade.findAll(), ((Student)user).getStudyLevel());
            session.setAttribute("studentNotifications", studentNotifications);
            
            
            
            response.sendRedirect("studentDashboard.jsp");
            
        }
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    private List<Notification> getStudentNotofications(List<Notification>notifications,int level)
    {
        notifications = notificationFacade.findAll();
        
        for(Notification notif : notifications)
        {
            if(notif.getTargetLevel() != level)
            {
                notifications.remove(notif);
            }
        }
        
        return notifications;
    }


}
