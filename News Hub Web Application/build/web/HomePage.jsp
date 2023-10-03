<%-- 
    Document   : HomePage
    Created on : Oct 3, 2023, 11:25:45 AM
    Author     : DXgriz
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.news.hub.entity.notifications.Notification"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Pages/HomePage.css" type="text/css"/>
        <title>Home</title>
    </head>
    <body>
        <section class="header" >

            <div class="logo">
                <img src="Pages/logo.png" alt="logo_image" id="img">
            </div>

            <div class="nav-list">
                <ul>
                    <li><a href="login_signup.jsp">Login</a></li>
                    <li><a href="login_signup.jsp">Sign Up</a></li>
                    <li><a href="index.html">About US</a></li>
                </ul>
            </div>
            </div>
        </section>

        <%
            
            //To generate a dynamic News/Notifications Feed.
            
            List<Notification> generalNotifications = (List<Notification>)session.getAttribute("notifications");
            
        %>

        <section class="body_content">
            <h5>Notifications And Advertisements</h5>
            <table>
                <%
                    if (!generalNotifications.isEmpty()) {
                        for (Notification notification : generalNotifications) {
                %>
                <tr>
                    <th><%=notification.getComposer()%></th>
                </tr>
                <tr>
                    <th><%=notification.getBody()%></th>
                </tr>
                <tr>
                    <th><%=notification.getAttachments()%></th>
                </tr>
                <tr>
                    <th>posted on <%=notification.getComposedDate()%></th>
                </tr>
                <%
                    }
                    } else {
                %>
                            <tr>
                                <th> No notifications at the moment. 
                                    <br><a href="HomePage.jsp">Refresh Page</a></th>
                            </tr>
                        }
                    }
                %>
            </table>
        </section>
    </body>
</html>
