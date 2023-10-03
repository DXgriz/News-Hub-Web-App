package com.news.hub.web.controller;

import com.news.hub.dao.LoginInfoFacadeLocal;
import com.news.hub.entity.data.LoginInfo;
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
 * @author DXgriz
 */
public class Login extends HttpServlet {

    @EJB
    private LoginInfoFacadeLocal loginInfoFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String emailAddress = request.getParameter("email");
        String password = request.getParameter("password");

        List<LoginInfo> data = loginInfoFacade.findAll();

        for (LoginInfo info : data) {

            if (info.getEmailAddress().equalsIgnoreCase(emailAddress)
                    && info.getPassword().equals(password)) {
                

            } else {
            }
        }
    }
}
