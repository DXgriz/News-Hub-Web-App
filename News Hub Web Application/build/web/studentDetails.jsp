<%-- 
    Document   : studentDetails
    Created on : 15 Oct 2023, 7:33:46 PM
    Author     : andil
--%>

<%@page import="com.news.hub.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="Pages/studentDetails.css">
    <title>Document</title>
</head>
<body>
    <div class="background"></div>
    <div class="container">
        <div class="left-nav">
            <div class="logo-cont">
                <img src="Pages/logo.png" alt="">
            </div>
            <div class="nav-container ">
                <a href="">
                    <i class="fa-solid fa-house" ></i> Home
                </a>
            </div>
            <div class="nav-container active">
                <a href="">
                    <i class="fa-solid fa-user"></i> Account
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
            Student student = (Student)session.getAttribute("user");
        %>
        <div class="body-cont">
            <div class="form">
                <form action="EditStudentDetails.do" method="POST">
                        <div class="edit">
                            <i class="fa-solid fa-user"></i>
                            <input type="text" name="firstname" id="" value="<%=student.getFirstName()%>" required>
                        </div>
                        
                        <div class="edit">
                            <i class="fa-solid fa-user"></i>
                            <input type="text" name="lastname" id="" value="<%=student.getLastName()%>" required>
                        </div>
                        <div class="edit">
                            <i class="fa-solid fa-envelope"></i>
                            <input type="email" name="email" id="" value="<%=student.getEmailAddress()%>" required>
                        </div>
                        <div class="edit">
                            <i class="fa-solid fa-lock"></i>
                            <input type="password" name="password" id="" value="<%=student.getPassword()%>" required>
                        </div>
                        
                            <input type="submit" name="" id="" value="submit" class="edit submit" >
                        
                    
                        
                </form>
                <a href="DashboardServlet.do" >
                    <button>Back</button>
                </a>
            </div>
                
        </div>



    </div>
</body>
</html>
