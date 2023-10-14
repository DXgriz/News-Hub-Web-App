/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.controller;

import com.news.hub.entities.Notification;
import com.news.hub.session.NotificationFacadeLocal;
import java.io.IOException;
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
public class NotificationServlet extends HttpServlet {

    @EJB
    private NotificationFacadeLocal notificationFacade;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        Notification notification = notificationFacade.find( Long.parseLong(request.getParameter("notificationId")));
        session.setAttribute("selectedNotification", notification);
        
        
        request.getRequestDispatcher("displayNotification.jsp").forward(request, response);
    }


}
