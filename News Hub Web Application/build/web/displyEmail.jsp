<%-- 
    Document   : displyEmail
    Created on : 18 Oct 2023, 8:21:15 PM
    Author     : andil
--%>

<%@page import="java.nio.charset.StandardCharsets"%>
<%@page import="com.news.hub.entities.Email"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="Pages/displayEmail.css">
    <title>JSP Page</title>
</head>
<body>
    <div class="background"></div>
    <div class="container" id="">
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
                <a href="">
                    <i class="fa-solid fa-house" ></i> Home
                </a>
            </div>
            <div class="nav-container">
                <a href="">
                    <i class="fa-solid fa-bell"></i> Notification
                </a>
            </div>
            <div class="nav-container">
                <a href="">
                    <i class="fa-solid fa-envelope"></i> Email
                </a>
            </div>

            <div class="nav-container logout">
                <a href="">
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
        
        
        <%
            Email emailToRead = (Email)session.getAttribute("emailToRead");
        %>
        <div class="body-cont">
            <p><%=new String(emailToRead.getContent(),StandardCharsets.UTF_8) %></p>
            
        </div>
        <div class="text">
            <h1><%=emailToRead.getSubjectLine() %></h1>
        </div>
    </div>
</body>
</html>
