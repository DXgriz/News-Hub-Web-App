<%-- 
    Document   : studentDashboard
    Created on : 12 Oct 2023, 7:27:23 PM
    Author     : andil
--%>

<%@page import="com.news.hub.entities.Notification"%>
<%@page import="java.util.List"%>
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
    <div class="background"></div>
    <div class="container">
        <div class="left-nav">
            <div class="logo-cont">
                <img src="Pages/logo.png" alt="">
            </div>
            <div class="nav-container active">
                <a href="">
                    <i class="fa-solid fa-house" ></i> Home
                </a>
            </div>
            <div class="nav-container">
                <a href="studentDetails.jsp">
                    <i class="fa-solid fa-user"></i> Account
                </a>
            </div>
            <div class="nav-container">
                <a href="">
                    <i class="fa-solid fa-bell"></i> Notification
                </a>
            </div>
            <div class="nav-container">
                <a href="emailViewPage.jsp">
                    <i class="fa-solid fa-envelope"></i> Email
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
                
            </div>
        </div>
        <!--
            END : TOP-NAV
            START : BODY-CONT
        -->
        <div class="body-cont">
            <form action="NotificationServlet.do" method="POST">
                
                <%
                    //Use for each loop
                    
                    List<Notification>studentNotifications = (List<Notification>)session.getAttribute("studentNotifications");
                    
                    
                    for(Notification notif : studentNotifications){
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
                <h1>Today's Headlines</h1>
        </div>


    </div>
</body>
</html>