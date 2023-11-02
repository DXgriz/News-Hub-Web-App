<%-- 
    Document   : displayTickets
    Created on : Nov 2, 2023, 3:59:20 PM
    Author     : vuyan
--%>

<%@page import="com.news.hub.entities.SupportTicket"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Support Tickets</title>

        <link rel="stylesheet" href="Pages/admin.css">

        <style>
            tr:nth-child(odd)
            {
                background-color:  appworkspace;

            }
            tr:nth-child(even)
            {
                background-color: #c7cbd6;
            }
        </style>
    </head>
    <body>
        <%
            List<SupportTicket> tickets = (List<SupportTicket>) session.getAttribute("tickets");
        %>
        <div class="background"></div>


        <div class="container">

            <div class="left-nav">

                <div class="logo-cont">
                    <img src="Pages/logo.png" alt="Logo">
                </div>

                <div class="nav-container active">
                    <a href="AdminPanel.jsp">
                        <i class="fa-solid fa-house" ></i> Admin Panel
                    </a>
                </div>

                <div class="nav-container">
                    <a href="studentDetails.jsp">
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
                        <i class="fa-solid fa-door-open"></i>logout
                    </a>
                </div>
            </div>

            <!--
                END : LEFT-NAV
                START: TOP-NAV
            -->

            <div class="top-nav">
                <a href="AdminPanel.jsp">Admin Tools</a>
                <a href="https://www.unizulu.ac.za/contact-us/"><b>about us</b></a>

                <form action="">
                    <i class="fa-solid fa-magnifying-glass"></i>
                    <input type="search" name="search" placeholder="Search for anything">
                </form>

                <div class="userProfile">
                    <i style="color: teal">Admin</i>
                </div>
            </div>
            <!--
                END : TOP-NAV
                START : BODY-CONT
            -->
            <div class="body-cont" >

                <table style="width: 100%; margin-top: 2%">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Sent By</th>
                            <th>Priority</th>
                            <th>Query</th>



                        </tr>
                    </thead>
                    <tbody>
                        <%  for (int i = 0; i < tickets.size(); i++) {
                                SupportTicket ticket = tickets.get(i);
                                
                        %>
                        <tr>
                            <td><%=i%></td>
                            <td><%=ticket.getLoggerEmailAddress()%></td>
                            <td><%=ticket.getPriority()%></td>
                            <td><%=new String(ticket.getQuery(),"UTF-8")%></td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>

            <div class="text">
                <h1>Hello Admin </h1>
            </div>

        </div>
    </body>
</html>
