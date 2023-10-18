<%-- 
    Document   : staffDashboard
    Created on : Oct 13, 2023, 11:38:06 AM
    Author     : vuyan
--%>

<%@page import="com.news.hub.entities.Notification"%>
<%@page import="java.util.List"%>
<%@page import="com.news.hub.entities.SystemUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>dashboard</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="Pages/learneDahboard.css">
    </head>
    <body>
        <%
            SystemUser user = (SystemUser) session.getAttribute("user");
            String userInitials = user.getFirstName().substring(1,1)
                                    + user.getLastName().substring(1,1);
        %>
    <div class="background"></div>
    
    <div class="container">
        
        <div class="left-nav">
            
            <div class="logo-cont">
                <img src="Pages/logo.png" alt="Logo">
            </div>
            
            <div class="nav-container active">
                <a href="">
                    <i class="fa-solid fa-house" ></i> Home
                </a>
            </div>
            
            <div class="nav-container">
                <a href="">
                    <i class="fa-solid fa-user"></i>Profile
                </a>
            </div>
            
            <div class="nav-container">
                <a href="">
                    <i class="fa-solid fa-bell"></i> Notifications
                </a>
            </div>
            
            <div class="nav-container">
                <a href="emailViewPage.jsp">
                    <i class="fa-solid fa-envelope"></i> Emails
                </a>
            </div>
            <div class="nav-container">
                <a href="support.jsp">
                    <i class="glyphicon glyphicon-care"></i> Support
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
            <a href="https://www.unizulu.ac.za/contact-us/"><b>contact us</b></a>
            <a href="https://www.unizulu.ac.za/contact-us/"><b>about us</b></a>

            <form action="">
                <i class="fa-solid fa-magnifying-glass"></i>
                <input type="search" name="search" placeholder="Search for anything">
            </form>

            <div class="userProfile">
                <i style="color: teal"><%=userInitials%></i>
            </div>
        </div>
        <!--
            END : TOP-NAV
            START : BODY-CONT
        -->
        <div class="body-cont">
            <form action="NotificationServlet.do" method="POST">
                
                <%
                    List<Notification>notificationsByUser = (List<Notification>)session.getAttribute("notificationsByUser");
               
                    for(Notification notif : notificationsByUser){
                %>
                <button type="submit" name="notificationId" value="<%=notif.getNotifId()%>" class="notification-summary">
                      <img src="Pages/graduation.png" alt="" >  
                      <h1> <%=notif.getSubjectLine()%></h1>    
                       <div class="notification-date">
                            23 / 02 / 2023
                       </div>        
                </button>
                <%
                    }
                %>
            </form>
        </div>
        
        <div class="text">
                <h1>Hello <%=user.getFirstName()%> </h1>
        </div>

    </div>
</body>
</html>

