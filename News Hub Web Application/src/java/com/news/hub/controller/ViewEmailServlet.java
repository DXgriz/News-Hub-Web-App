/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.controller;

import com.news.hub.entities.Email;
import com.news.hub.session.EmailFacadeLocal;
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
public class ViewEmailServlet extends HttpServlet {

    @EJB
    private EmailFacadeLocal emailFacade;


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
        Long emailId = Long.parseLong(request.getParameter("emailId"));
        
        Email emailToread = emailFacade.find(emailId);
        
        session.setAttribute("emailToRead", emailToread);
        request.getRequestDispatcher("displyEmail.jsp").forward(request, response);
        
    }

}
