/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.controller;

import com.news.hub.entities.SystemUser;
import com.news.hub.session.SystemUserFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andil
 */
public class ResetPassword extends HttpServlet {

    @EJB
    private SystemUserFacadeLocal systemUserFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ResetPassword</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<script> alert('Your password has been successfully reset');"
                    + "setTimeout(() => {\n" 
                    + "window.location.href = 'login_signup.jsp';}, 0);"
                    + "</script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        Long id = Long.parseLong(request.getParameter("id"));
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        

        
        
        
        try{
        
            SystemUser user = findMathichingUser(email);
            if(verifyUserId(user, id))
            {
                user.setPassword(password);
                systemUserFacade.edit(user);
                processRequest(request, response);
            }else
            {
                request.setAttribute("loginError", "User Account not found");
                request.getRequestDispatcher("login_signup.jsp").forward(request, response);
                
            }
        
            
        }catch(NullPointerException e)
        {
            request.setAttribute("loginError", "User Account not found");
            request.getRequestDispatcher("login_signup.jsp").forward(request, response);
        }

    }
    private SystemUser findMathichingUser(String email)
    {
        SystemUser matchingUser = new SystemUser();
        for(SystemUser user : systemUserFacade.findAll())
        {
            if(user.getEmailAddress().equalsIgnoreCase(email))
            {
                matchingUser = user;
                break;
            }
        }
        
        return matchingUser;
    }
    private boolean verifyUserId(SystemUser user,Long id)
    {
        return user.getId().equals(id);
    }
}
