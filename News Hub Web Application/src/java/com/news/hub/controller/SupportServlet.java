package com.news.hub.controller;

import com.news.hub.entities.SupportTicket;
import com.news.hub.session.SupportTicketFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vuyan
 */
public class SupportServlet extends HttpServlet {

    @EJB
    private SupportTicketFacadeLocal supportTicketFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SupportServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SupportServlet at " + request.getContextPath() + "</h1>");
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
            throws ServletException, IOException {
        processRequest(request, response);

        String email = request.getParameter("sender");
        String query = request.getParameter("query");
        String checkbox = request.getParameter("high");
        
        byte[] bodyBytes = query.getBytes();
        String priority ;
        
        if (checkbox != null && checkbox.equalsIgnoreCase("high")) {
            priority = "high";
            
            SupportTicket ticket = generateTicket(email, bodyBytes, priority);
            supportTicketFacade.create(ticket);
            
        } else {
            
            priority = "low";
            
            SupportTicket ticket = generateTicket(email, bodyBytes, priority);
            supportTicketFacade.create(ticket);
        }
        
        //request.getRequestDispatcher("support.jsp").forward(request, response);
        response.sendRedirect("support.jsp");
        System.out.println("Support Ticket Logged");
        
    }
    public SupportTicket generateTicket(String emailFrom, byte[] contents, String priority){
        SupportTicket ticket = new SupportTicket();
        
        ticket.setLoggerEmailAddress(emailFrom);
        ticket.setQuery(contents);
        ticket.setPriority(priority);
        
        return ticket;
    }
}
