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
import javax.servlet.http.HttpSession;

/**
 *
 * @author andil
 */
public class LoginServlent extends HttpServlet {

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
            out.println("<title>Servlet LoginServlent</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlent at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        HttpSession session = request.getSession(true);
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        try{
            
            SystemUser user = findMathichingUser(email);
            if(verifyUserPassword(user, password))
            {
                //request.getRequestDispatcher("DashboardServlet.do").forward(request, response);
                response.sendRedirect("DashboardServlet.do");
            }else
            {
                request.setAttribute("loginError", "Invalid username or password");
               request.getRequestDispatcher("login_signup.jsp").forward(request, response);
            }
            
            session.setAttribute("user", user);
            System.out.println("Login success");
        
        }catch(NullPointerException ex)
        {
            System.out.println("User not found ");
            // direct to loginPage
            
            request.setAttribute("loginError", "Invalid username or password");
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
    private boolean verifyUserPassword(SystemUser user,String password)
    {
        return user.getPassword().equals(password);
    }
}
