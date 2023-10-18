package com.news.hub.controller;

import com.news.hub.entities.Email;
import com.news.hub.entities.SystemUser;
import com.news.hub.session.EmailFacadeLocal;
import com.news.hub.session.SystemUserFacadeLocal;
import java.io.IOException;
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
 * @author vuyan
 */
public class SendEmail extends HttpServlet {
    
    @EJB
    private SystemUserFacadeLocal systemUserFacade;
    
    @EJB
    private EmailFacadeLocal emailFacade;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        SystemUser user = (SystemUser) session.getAttribute("user");
        
        List<SystemUser> reciever = findReceipient(request.getParameter("recipients"));
        String subjectLine = request.getParameter("subject");
        String body = request.getParameter("content");
        
        Email email = setEmailContents(subjectLine, user, reciever, body);
        emailFacade.create(email);
        System.out.println("Email sent successfully to: " + reciever.size() +" users." + reciever.get(0).getEmailAddress() );
        response.sendRedirect("emailViewPage.jsp");

        /*
        List<SystemUser> recipients = new ArrayList<>();

        String data[] = request.getParameterValues("receipients");

        for (int i = 0; i < data.length; i++) {
            String email = data[i];
            recipients = findReceipients(email);
        }

        String subjectLine = request.getParameter("subjectLine");
        String content = request.getParameter("emailBody");
        byte[] fileAttachment;

        System.out.println("email sent to: " + recipients);
         */
    }
    
    private List<SystemUser> findReceipient(String email) {
        
        List<SystemUser> receipients = new ArrayList<>();
        
        for (SystemUser matchingUser : systemUserFacade.findAll()) {
            if (matchingUser.getEmailAddress().equalsIgnoreCase(email)) {
                receipients.add(matchingUser);
            }
        }
        return receipients;
    }
    
    private Email setEmailContents(String subjectLine, SystemUser sender, List<SystemUser> recipient, String content) {
        Email email = new Email();
        email.setSender(sender);
        email.setRecipient(recipient);
        email.setSubjectLine(subjectLine);
        email.setContent(content);
        
        return email;
    }
}
