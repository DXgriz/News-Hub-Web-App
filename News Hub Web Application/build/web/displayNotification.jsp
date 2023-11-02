<%-- 
    Document   : displayNotification
    Created on : 14 Oct 2023, 5:15:32 PM
    Author     : andil
--%>

<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.nio.charset.StandardCharsets"%>
<%@page import="com.news.hub.entities.Notification"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notifications</title>
        <link rel="stylesheet" href="Pages/displayNotif.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    
    </head>
    <body>
           <div class="background"></div>
    <div class="container">
        <div class="left-nav">
            <div class="logo-cont">
                <img src="Pages/logo.png" alt="">
            </div>
            <div class="nav-container active">
                <a href="DashboardServlet.do">
                    <i class="fa-solid fa-house" ></i> Home
                </a>
            </div>
            <div class="nav-container">
                <a href="studentDetails.jsp">
                    <i class="fa-solid fa-user"></i> Account
                </a>
            </div>
            <div class="nav-container active">
                <a href="">
                    <i class="fa-solid fa-bell"></i> Notification
                </a>
            </div>
            <div class="nav-container">
                <a href="emailViewPage.jsp">
                    <i class="fa-solid fa-envelope"></i> Email
                </a>
                <div class="nav-container">
                <a href="support.jsp">
                    <i class="fa-solid fa-magnifying-glass"></i> Help & Support
                </a>
            </div>
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
            
                    
                    <%
                    
                        Notification selectedNotification = (Notification)session.getAttribute("selectedNotification");
                        File file = new File("D:/Files/projects/Git projects/News Hub/News-Hub-Web-App/News Hub Web Application/web/Notifications/"+selectedNotification.getFileName());
                        file.createNewFile();
                        
                       OutputStream os = new FileOutputStream(file);
                       os.write(selectedNotification.getFile());
                       os.flush();
                       os.close();
                    %>
                    <div id="notifVisible" class="notification-details" >
                    <div class="content-file">
                        
                        
                        <img src="Notifications/<%=selectedNotification.getFileName() %>" alt="">
                    </div>
                    <h1 class="subject">
                       <u> <%=selectedNotification.getSubjectLine()%></u>
                    </h1>
                    <div class="content">
                        <p>
                            <%=new String(selectedNotification.getContent(),StandardCharsets.UTF_8)%>
                        </p>
                    </div>
                    </div>
        </div>
        <div class="text">
                <h1>Today's Headlines</h1>
        </div>


    </div>
    </body>
</html>
