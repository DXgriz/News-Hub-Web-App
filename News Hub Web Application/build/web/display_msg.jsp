<%-- 
    Document   : display_msg
    Created on : Oct 3, 2023, 9:55:00 PM
    Author     : DXgriz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Registered</title>
    </head>
    <body>
        <%
            String emailAddress =session.getAttribute("emailAddress").toString();
        %>
        <h1>Account Successfully Created For USername: <%=emailAddress%></h1>
        <br><br>
        <a href="login_signup.jsp">LOGIN</a>
    </body>
</html>
