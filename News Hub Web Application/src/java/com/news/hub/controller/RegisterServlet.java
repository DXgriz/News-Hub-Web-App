/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.controller;

import com.news.hub.entities.Staff;
import com.news.hub.entities.Student;
import com.news.hub.entities.SystemUser;
import com.news.hub.session.CourseFacadeLocal;
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
public class RegisterServlet extends HttpServlet {

    @EJB
    private SystemUserFacadeLocal systemUserFacade;

    @EJB
    private CourseFacadeLocal courseFacade;


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
        HttpSession session = request.getSession(true);
        SystemUser user = new SystemUser();
        
        try{
            String userType = request.getParameter("userType");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String identity = request.getParameter("identity");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            user.setFirstName(firstname);
            user.setLastName(lastname);
            user.setId(Long.parseLong(identity));
            user.setEmailAddress(email);
            user.setPassword(password);
            if(userType.equalsIgnoreCase("staff"))
            {
                String occupation = request.getParameter("occupation");
                
                Staff staff = new Staff();
                staff.setFirstName(firstname);
                staff.setLastName(lastname);
                staff.setId(Long.parseLong(identity));
                staff.setEmailAddress(email);
                staff.setPassword(password);
                staff.setStaffNumber( Long.parseLong(request.getParameter("staffNumber")));
                staff.setOccupation(occupation);
                
                //user = staff;
                session.setAttribute("user", staff);
                systemUserFacade.create(staff);
                
                
            }else if(userType.equalsIgnoreCase("student"))
            {
                Student student = new Student();
                student.setFirstName(firstname);
                student.setLastName(lastname);
                student.setId(Long.parseLong(identity));
                student.setEmailAddress(email);
                student.setPassword(password);
                student.setStudentNumber(Long.parseLong(request.getParameter("studentNumber")));
                student.setCourse(courseFacade.find(request.getParameter("course")));
                
                session.setAttribute("user", student);
                
               // user = student;
               systemUserFacade.create(student);
               
            }
            
            
            
            //session.setAttribute("user", user);
            response.sendRedirect("DashboardServlet.do");
            //request.getRequestDispatcher("DashboardServlet.do").forward(request, response);
            //response.sendRedirect("DashboardServlet.do");
        }catch(NullPointerException e)
        {
            
        }

         //session.setAttribute("user", user);
               
    }
 
}
