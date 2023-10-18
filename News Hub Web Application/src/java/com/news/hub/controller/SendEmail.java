package com.news.hub.controller;

import com.news.hub.entities.Email;
import com.news.hub.entities.SystemUser;
import com.news.hub.session.EmailFacadeLocal;
import com.news.hub.session.SystemUserFacadeLocal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author vuyan
 */
@MultipartConfig
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
        
        Part part = request.getPart("attachment");
        InputStream inputStream = part.getInputStream();
        
        byte[] fileBytes = new byte[inputStream.available()];
        inputStream.read(fileBytes);
        

        
        String subjectLine = request.getParameter("subject");
        String body = request.getParameter("content");
        
        byte[] bodyBytes = body.getBytes();
        Email email = setEmailContents(subjectLine, user, reciever, bodyBytes,fileBytes);
        
        
        
        emailFacade.create(email);
        System.out.println( new String(bodyBytes,StandardCharsets.UTF_8));
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
    
    private Email setEmailContents(String subjectLine, SystemUser sender, List<SystemUser> recipient, byte[] content,byte[] fileBytes) {
        Email email = new Email();
        email.setSender(sender);
        email.setRecipient(recipient);
        email.setSubjectLine(subjectLine);
        email.setContent(content);
        email.setFileAttachment(fileBytes);
        
        return email;
    }
}
