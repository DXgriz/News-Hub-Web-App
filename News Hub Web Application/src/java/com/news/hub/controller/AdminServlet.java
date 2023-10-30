/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.hub.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andil
 */
public class AdminServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        String action = request.getParameter("action");
        
        if(action.equalsIgnoreCase("students"))
        {
            request.getRequestDispatcher("displayStudents.jsp").forward(request, response);
        }else if(action.equalsIgnoreCase("staffMembers"))
        {
            request.getRequestDispatcher("").forward(request, response);
        }else 
        {
          
            request.getRequestDispatcher("").forward(request, response);
        }       
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        
    }

}
