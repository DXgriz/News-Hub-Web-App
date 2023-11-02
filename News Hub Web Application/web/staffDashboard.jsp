<%-- 
    Document   : staffDashboard
    Created on : Oct 13, 2023, 11:38:06 AM
    Author     : vuyan
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
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
        <link rel="stylesheet" href="Pages/emailView.css">
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
                <a href="DashboardServlet.do">
                    <i class="fa-solid fa-house" ></i> Home
                </a>
            </div>
            
            <div class="nav-container">
                <a href="studentDetails.jsp">
                    <i class="fa-solid fa-user"></i>Account
                </a>
            </div>
            
            <div class="nav-container">
                <a href="DashboardServlet.do">
                    <i class="fa-solid fa-bell"></i> Notifications
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
             <button id="composeBtn" ><i class="fa-solid fa-pen"></i><b>notification</b></button>
            <a href="https://www.unizulu.ac.za/contact-us/"><b>about us</b></a>

            <form action="">
                <i class="fa-solid fa-magnifying-glass"></i>
                <input type="search" name="search" placeholder="Search for anything">
            </form>

            <div class="userProfile">
                <i style="color: black;"><%=userInitials%></i>
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
                         File file = new File("D:/Files/projects/Git projects/News-Hub-Web-App/News Hub Web Application/web/Notifications/"+notif.getFileName());
                        file.createNewFile();
                        
                       OutputStream os = new FileOutputStream(file);
                       os.write(notif.getFile());
                       os.flush();
                       os.close();
                %>
                <button type="submit" name="notificationId" value="<%=notif.getNotifId()%>" class="notification-summary">
                      <img src="Notifications/<%=notif.getFileName()%>" alt="" >  
                      <h1> <%=notif.getSubjectLine()%></h1>    
                       <div class="notification-date">
                           <%=notif.getCreationDate().getDate()%> / <%=notif.getCreationDate().getMonth()+1%> / <%=notif.getCreationDate().getYear()%>
                       </div>        
                </button>
                <%
                    }
                %>
            </form>
                <div class="compose-email" id="compose">
                    
                    <form action="CreateNotification.do" method="POST" enctype="multipart/form-data">

                        <div class="reciever">
                            <p>To: </p>
                            <select name="level" required="">
                                <option>--select level--</option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                            </select>
                            
                            <button class="cancel-btn" id="composeBtn"><b>X</b></button>
                        </div>

                        <div class="subject">

                            <input type="text" name="subject" placeholder="Subject line" required="">
                        </div>

                        <div class="body">
                            <textarea name="content" placeholder="Type something here "required=""></textarea>
                        </div>

                        <div class="attachment">
                            <input type="file" name="file" 
                                   accept="image/png,image/jpeg,image/jpg,document/doc,document/pdf" 
                                   multiple="multiple">
                        </div>

                        <div class="submit-btn">
                            <input type="submit" value="Create noification">
                        </div>
                    </form>
                </div>
        </div>
        
        <div class="text">
                <h1>Hello <%=user.getFirstName()%> </h1>
        </div>

    </div>
        <script src="Pages/emailScript.js"></script>
</body>
</html>

