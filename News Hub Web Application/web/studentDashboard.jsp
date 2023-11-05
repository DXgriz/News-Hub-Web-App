<%-- 
    Document   : studentDashboard
    Created on : 12 Oct 2023, 7:27:23 PM
    Author     : andil
--%>

<%@page import="com.news.hub.entities.SystemUser"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%@page import="com.news.hub.entities.Notification"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>dashboard</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" 
              integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" 
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
                <a href="DashboardServlet.do">
                    <i class="fa-solid fa-bell"></i> Notification
                </a>
            </div>
            <div class="nav-container">
                <a href="emailViewPage.jsp">
                    <i class="fa-solid fa-envelope"></i> Email
                </a>
            </div>
            <div class="nav-container">
                <a href="support.jsp">
                    <i class="fa-solid fa-magnifying-glass"></i> Help & Support
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

            <form action="SearchServlet.do" method="post">
                <i class="fa-solid fa-magnifying-glass"></i>
                <input type="search" name="search" placeholder="Search for anything">
            </form>

            <div class="userProfile">
                <h1 style="color: black;">
                    <% 
                        SystemUser user = (SystemUser)session.getAttribute("user");
                        
                    %>
                    <b><%= user.getFirstName().substring(0, 1) + user.getLastName().substring(0, 1)%></b>
                </h1>
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
                        
                    File file = new File("D:/Files/projects/Git projects/News-Hub-Web-App/News Hub Web Application/web/Notifications/"+notif.getFileName());
                        file.createNewFile();
                        
                       OutputStream os = new FileOutputStream(file);
                       os.write(notif.getFile());
                       os.flush();
                       os.close();
                %>
                <button type="submit" name="notificationId" value="<%=notif.getNotifId()%>" class="notification-summary">
                    <img src="Notifications/<%=notif.getFileName()%>" alt="" >  
                    <h1 style="color: black;"> <%=notif.getSubjectLine()%></h1>    
                       <div class="notification-date">
                           <%=notif.getCreationDate().getDate()%> / <%=notif.getCreationDate().getMonth()+1%> / <%= (notif.getCreationDate().getYear()+"").substring(1, 3) %>
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
