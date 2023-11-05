/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.controller;

import com.news.hub.entities.Notification;
import com.news.hub.entities.Student;
import com.news.hub.session.NotificationFacadeLocal;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
 * @author andil
 */
public class SearchServlet extends HttpServlet {

    @EJB
    private NotificationFacadeLocal notificationFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        String search = request.getParameter("search");
        HttpSession session = request.getSession();
        session.setAttribute("studentNotifications", filterNotif((Student)session.getAttribute("user"),search));
        request.getRequestDispatcher("studentDashboard.jsp").forward(request, response);

    }private List<Notification> filterNotif(Student student,String search)
    {
        List<Notification> notifiations = new ArrayList<>();
        for(Notification notification : notificationFacade.findAll())
        {
            String notiCont = new String(notification.getContent(),StandardCharsets.UTF_8);
            if((notification.getSubjectLine().contains(search) || notiCont.contains(search)) && student.getStudyLevel().equals(notification.getTargetLevel()))
            {
                notifiations.add(notification);
            }
        }
        
        return notifiations;
    }

}
