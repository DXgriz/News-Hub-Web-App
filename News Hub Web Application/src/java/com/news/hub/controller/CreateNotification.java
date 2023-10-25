/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.controller;

import com.news.hub.entities.Notification;
import com.news.hub.entities.Staff;
import com.news.hub.entities.SystemUser;
import com.news.hub.session.NotificationFacadeLocal;
import com.news.hub.session.SystemUserFacadeLocal;
import java.io.IOException;
import java.io.InputStream;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author andil
 */
@MultipartConfig
public class CreateNotification extends HttpServlet 
{

    @EJB
    private SystemUserFacadeLocal systemUserFacade;

    @EJB
    private NotificationFacadeLocal notificationFacade;

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        Staff user = (Staff)session.getAttribute("user");
        String subjectLine = request.getParameter("subject");
        String content = request.getParameter("content");
        Part part = request.getPart("file");
        InputStream is = part.getInputStream();
        
        byte[] file = new byte[is.available()];
        is.read(file);
        
        
        int level  = Integer.parseInt(request.getParameter("level"));
        
        
        Notification notif = createNotification(content, file, level, subjectLine);
        
        user.getNotifications().add(notif);
        systemUserFacade.edit(user);
        
        response.sendRedirect("DashboardServlet.do");
        

    }
    private Notification createNotification(String content,byte[] file,int level, String subject)
    {
        Notification notif  = new Notification();
        notif.setContent(content);
        notif.setFile(file);
        notif.setTargetLevel(level);
        notif.setSubjectLine(subject);

        return notif;
    }
    

}