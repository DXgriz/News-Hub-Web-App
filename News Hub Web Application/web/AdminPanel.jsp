<%-- 
    Document   : AdminPanel
    Created on : Oct 25, 2023, 10:13:29 PM
    Author     : DXgriz
--%>

<%@page import="com.news.hub.entities.SystemUser"%>
<%@page import="com.news.hub.entities.SupportTicket"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
    </head>
    <body>
        <%
            //List<SupportTicket> tickets = (List<SupportTicket>)session.getAttribute("tickets");
            //List<SystemUser> allUsers =(List<SystemUser>)session.getAttribute("allUsers");
            SystemUser admin = (SystemUser) session.getAttribute("user");
        %>
        <div class="background"></div>
        
        
        <div class="container">
        
        <div class="left-nav">
            
            <div class="logo-cont">
                <img src="Pages/logo.png" alt="Logo">
            </div>
            
            <div class="nav-container active">
                <a href="#">
                    <i class="fa-solid fa-house" ></i> Manage Users
                </a>
            </div>
            
            <div class="nav-container">
                <a href="#">
                    <i class="fa-solid fa-user"></i>Manage Account
                </a>
            </div>
            
            <div class="nav-container">
                <a href="#">
                    <i class="fa-solid fa-bell"></i> Manage Tickets
                </a>
            </div>

            <div class="nav-container logout">
                <a href="LogoutServlet.do">
                    <i class="fa-solid fa-door-open"></i>logout
                </a>
            </div>
        </div>

        <!--
            END : LEFT-NAV
            START: TOP-NAV
        -->

        <div class="top-nav">
             <button id="composeBtn" ><i class="fa-solid fa-pen"></i><b>Admin Tools</b></button>
            <a href="https://www.unizulu.ac.za/contact-us/"><b>about us</b></a>

            <form action="">
                <i class="fa-solid fa-magnifying-glass"></i>
                <input type="search" name="search" placeholder="Search for anything">
            </form>

            <div class="userProfile">
                <i style="color: teal">Admin</i>
            </div>
        </div>
        <!--
            END : TOP-NAV
            START : BODY-CONT
        -->
        <div class="body-cont">

        </div>
        
        <div class="text">
                <h1>Hello Admin </h1>
        </div>

    </div>
    </body>
</html>
