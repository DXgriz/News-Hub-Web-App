/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.controller;

import com.news.hub.entities.Email;
import com.news.hub.entities.SystemUser;
import com.news.hub.session.EmailFacadeLocal;
import com.news.hub.session.SystemUserFacadeLocal;
import java.io.IOException;
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
public class DeleteUser extends HttpServlet 
{

    @EJB
    private EmailFacadeLocal emailFacade;

    @EJB
    private SystemUserFacadeLocal systemUserFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {        
        Long userId = Long.parseLong(request.getParameter("delete"));
        removeUserEmails(userId);
        systemUserFacade.remove(systemUserFacade.find(userId));
        HttpSession session = request.getSession();
        
        session.setAttribute("students", systemUserFacade.findAll());
        response.sendRedirect("DashboardServlet.do");
    }
    private void removeUserEmails(Long senderId)
    {
        List<Email>emails = emailFacade.findAll();
        for(Email email : emails)
        {
            if(email.getSender().getId().equals(senderId))
            {
                emailFacade.remove(email);
            }
        }
    }
}
