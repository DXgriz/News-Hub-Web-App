<%-- 
    Document   : AdminPanel
    Created on : Oct 25, 2023, 10:13:29 PM
    Author     : DXgriz
--%>

<%@page import="com.news.hub.entities.Course"%>
<%@page import="com.news.hub.entities.Student"%>
<%@page import="com.news.hub.entities.Staff"%>
<%@page import="com.news.hub.entities.SystemUser"%>
<%@page import="com.news.hub.entities.SupportTicket"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
        <link rel="stylesheet" href="Pages/admin.css">
    </head>
    <body>
        <%
            List<SupportTicket> tickets = (List<SupportTicket>)session.getAttribute("tickets");
            int highPriorityTickets =0;
            int lowPriorityTickets =0;
            for (SupportTicket ticket : tickets) {
                    if (ticket.getPriority().equalsIgnoreCase("high")) {
                            highPriorityTickets++;
                        } else {
                        lowPriorityTickets++;
                        }
                }
            
            SystemUser admin = (SystemUser) session.getAttribute("user");
            List<Student> students = (List) session.getAttribute("students");
            List<Staff> staffMembers = (List) session.getAttribute("staffMembers");
            List<Course> courses = (List) session.getAttribute("courses");

        %>
        <div class="background"></div>


        <div class="container">

            <div class="left-nav">

                <div class="logo-cont">
                    <img src="Pages/logo.png" alt="Logo">
                </div>

                <div class="nav-container active">
                    <a href="#">
                        <i class="fa-solid fa-house" ></i> Manage Users
                    </a>
                </div>

                <div class="nav-container">
                    <a href="#">
                        <i class="fa-solid fa-user"></i>Manage Account
                    </a>
                </div>

                <div class="nav-container">
                    <a href="displayTickets.jsp">
                        <i class="fa-solid fa-bell"></i> Manage Tickets
                    </a>
                </div>

                <div class="nav-container logout">
                    <a href="LogoutServlet.do">
                        <i class="fa-solid fa-door-open"></i>Logout
                    </a>
                </div>
            </div>

            <!--
                END : LEFT-NAV
                START: TOP-NAV
            -->

            <div class="top-nav">
                <a href="AdminPanel.jsp">Admin Tools</a>

                <form action="">
                    <i class="fa-solid fa-magnifying-glass"></i>
                    <input type="search" name="search" placeholder="Search for anything...">
                </form>

                <div class="userProfile">
                    <p style="color: black;"><b>Admin</b></p>
                </div>
            </div>
            <!--
                END : TOP-NAV
                START : BODY-CONT
            -->
            <div class="body-cont">
                <form method="GET" action="AdminServlet.do">
                    <button type="submit" value="students" name="action">
                        <div>
                            <%=students.size()%>
                        </div>
                        <h1>Students</h1>
                    </button>
                    <button type="submit" value="staffMembers" name="action">
                        <div>
                            <%=staffMembers.size()%>
                        </div>
                        <h1>Staff Members</h1>
                    </button>
                    <button type="submit" value="courses" name="action">
                        <div>
                            <%=courses.size()%>
                        </div>
                        <h1>Courses</h1>
                    </button>
                        
                        <button type="submit" value="tickets" name="action">
                        <div>
                            <%=tickets.size()%>
                        </div>
                            
                        <h1>Tickets</h1>
                    </button>

                </form>
            </div>

            <div class="text">
                <h1>Hello Admin </h1>
            </div>

        </div>
    </body>
</html>
