
<%@page import="com.news.hub.entity.notifications.Notification"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Pages/home_page.css" type="text/css"/>
    </head>
    <body>
        <%
            List<Notification> generalNotifications = (List<Notification>)session.getAttribute("notifications");
        %>
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

    <section class="body_content">
        <h5>Notifications And Advertisements</h5>
        <table>
            <%  if (!generalNotifications.isEmpty()) {
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
                    <br><a href="home_page.jsp">Refresh Page</a></th>
            </tr>
            <%
            }
            }
            %>
        </table>
    </section>
</body>
</html>
