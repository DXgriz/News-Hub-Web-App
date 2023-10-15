/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.controller;

import com.news.hub.entities.Student;
import com.news.hub.session.SystemUserFacadeLocal;
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
public class EditStudentDetails extends HttpServlet 
{

    @EJB
    private SystemUserFacadeLocal systemUserFacade;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        String firsname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        
        Student student = (Student)session.getAttribute("user");
        student.setEmailAddress(email);
        student.setFirstName(firsname);
        student.setLastName(lastname);
        student.setPassword(password);
        
        systemUserFacade.edit(student);
        response.sendRedirect("DashboardServlet.do");
        
    }

}
