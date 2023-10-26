package com.news.hub.controller;

import com.news.hub.entities.Administrator;
import com.news.hub.entities.Email;
import com.news.hub.entities.Notification;
import com.news.hub.entities.Staff;
import com.news.hub.entities.Student;
import com.news.hub.entities.SupportTicket;
import com.news.hub.entities.SystemUser;
import com.news.hub.session.EmailFacadeLocal;
import com.news.hub.session.NotificationFacadeLocal;
import com.news.hub.session.SupportTicketFacadeLocal;
import com.news.hub.session.SystemUserFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
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
public class DashboardServlet extends HttpServlet {

    @EJB
    private SupportTicketFacadeLocal supportTicketFacade;

    @EJB
    private NotificationFacadeLocal notificationFacade;

    @EJB
    private SystemUserFacadeLocal systemUserFacade;

    @EJB
    private EmailFacadeLocal emailFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DashboardServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DashboardServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        SystemUser user = (SystemUser) session.getAttribute("user");

        
        List<Email> emails = emailFacade.findAll();
        List<Email> loggedUserInbox = new ArrayList<>();
        List<Email> loggedUserSentEmails = new ArrayList<>();
        List<Email> userEmails = new ArrayList<>();
        List<SystemUser> allUsers = systemUserFacade.findAll();
        session.setAttribute("allUsers", allUsers);

        findUserEmail(user, userEmails);
        
             session.setAttribute("userEmails", userEmails);
        
        
        if (user instanceof Staff) {
            //TODO: Get all information realated to staff and redirect to Staff dashbboard
            List<Notification> notificationsByUser = ((Staff) user).getNotifications();
            session.setAttribute("notificationsByUser", notificationsByUser);

            //populating user inbox 
            for (Email email : emails) {
                if (email.getRecipient().contains(user)) {

                    loggedUserInbox.add(email);
                    session.setAttribute("userInboxEmails", loggedUserInbox);
                }
                if (email.getSender().equals(user)) {

                    loggedUserSentEmails.add(email);
                    session.setAttribute("userSentEmails", loggedUserSentEmails);
                }
            }
            response.sendRedirect("staffDashboard.jsp");

        } else if (user instanceof Student) {
            //TODO: Get all information realated to student and redirect to Student dashbboard
            
        //SystemUser user = (SystemUser)session.getAttribute("user");
        
             
            //populating user inbox 
            for (Email email : emails) {
                if (email.getRecipient().contains(user)) {

                    loggedUserInbox.add(email);
                    session.setAttribute("userInboxEmails", loggedUserInbox);
                }
                if (email.getSender().equals(user)) {

                    loggedUserSentEmails.add(email);
                    session.setAttribute("userSentEmails", loggedUserSentEmails);
                }
            }

            //getting student notifications
            List<Notification> studentNotifications = getStudentNotofications(((Student) user).getStudyLevel());
            session.setAttribute("studentNotifications", studentNotifications);

            response.sendRedirect("studentDashboard.jsp");
        }
        else if (user instanceof Administrator) {
            /*
            //get all information related to the authenticated admin,
            
            List<Notification> notificationsByUser = ((Administrator) user).getNotifications();
            session.setAttribute("notificationsByUser", notificationsByUser);
            */
            
            
            //get support tickets to be attended by admin and direct to the admin panel/ dashboard
            
            List<SupportTicket> tickets = supportTicketFacade.findAll();
            session.setAttribute("tickets", tickets);
            
            session.setAttribute("allUsers", allUsers);
            
            response.sendRedirect("AdminPanel.jsp");
        }
        
        
        
        
        
        
        
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private List<Notification> getStudentNotofications( int level) {
        List<Notification> notifications = notificationFacade.findAll();
        List<Notification> studentNotif = new ArrayList<>();
        
        for (Notification notif : notifications) {
            if (notif.getTargetLevel() == level) {
                studentNotif.add(notif);
            }
        }

        return studentNotif;
    }
    
        private void findUserEmail(SystemUser user,List<Email> userEmails)
    {
        List<Email> allEmails = emailFacade.findAll();
        
        for(Email email : allEmails)
        {
            List<SystemUser> recipients = email.getRecipient();
            for(SystemUser recipient : recipients)
            {
                if(user.getEmailAddress().equalsIgnoreCase(recipient.getEmailAddress()))
                {
                    userEmails.add(email);
                }
            }
        }
        
    }
}
