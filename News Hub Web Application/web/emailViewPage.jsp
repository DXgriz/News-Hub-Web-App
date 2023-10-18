<%-- 
    Document   : emailViewPage
    Created on : Oct 14, 2023, 8:55:02 AM
    Author     : vuyan
--%>


<%@page import="java.util.List"%>
<%@page import="com.news.hub.entities.SystemUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>emails</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" 
              integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" 
              crossorigin="anonymous" referrerpolicy="no-referrer" />

        <link rel="stylesheet" href="Pages/emailView.css">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body>

        <%
            SystemUser user = (SystemUser) session.getAttribute("user");
            List<SystemUser> allUsers = (List<SystemUser>) session.getAttribute("allUsers");

        %>

        <div class="background"></div>

        <!-- 
            START: LEFT-NAV
        -->
        <div class="container">

            <div class="left-nav" id="left-side">

                <div class="logo-cont">
                    <img src="Pages/logo.png" alt="Logo">
                </div>

                <div class="nav-container active">
                    <a href="">
                        <i class="fa-solid fa-envelope" ></i> Inbox
                    </a><span class="badge" style="background-color: red">8</span>
                </div> 

                <div class="nav-container">
                    <a href="">
                        <i class="fa-solid fa-envelope"></i>Sent
                    </a><span class="badge" style="background-color: red; list-style-type: circle;">13</span>
                </div>

                <div class="nav-container">
                    <a href="">
                        <i class="fa-solid fa-envelope"></i>Spam
                    </a><span class="badge" style="background-color: red">4</span>
                </div>

                <div class="nav-container">
                    <a href="">
                        <i class="fa-solid fa-envelope"></i>Outbox
                    </a><span class="badge" style="background-color: red">2</span>
                </div>

                <div class="nav-container">
                    <a href="">
                        <i class="fa-solid fa-envelope"></i>Drafts
                    </a><span class="badge" style="background-color: red">6</span>
                </div>

                <div class="nav-container">
                    <a href="">
                        <i class="fa-solid fa-envelope"></i>Deleted
                    </a><span class="badge" style="background-color: red">14</span>
                </div>

                <div class="nav-container">
                    <a href="">
                        <i class="fa-solid fa-envelope"></i>Archive
                    </a><span class="badge" style="background-color: red">8</span>
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

            <div class="top-nav" id="topNav">

                <button id="composeBtn" ><i class="fa-solid fa-pen"></i><b>compose</b></button>

                <a href="staffDashboard.jsp"><i class="fa-solid fa-house" ></i></a>

                <form action="">
                    <i class="fa-solid fa-magnifying-glass"></i>
                    <input type="search" name="search" placeholder="Search emails...">
                </form>

                <div class="userProfile">

                </div>
            </div>

            <div class="body-cont">
                <form action="" id="form">
                    <ul>
                        <li class=".email-summary">
                            <button type="submit">
                                <div class="sender-name">
                                    <p>firtname lastname</p>
                                </div>

                                <div class="subject-line">
                                    eMAIL subject line
                                </div>
                            </button>
                        </li>
                        <li class=".email-summary">
                            <button type="submit">
                                <div class="sender-name">
                                    <p>firtname lastname</p>
                                </div>

                                <div class="subject-line">
                                    eMAIL subject line
                                </div>
                            </button>
                        </li>
                        <li class=".email-summary">
                            <button type="submit">
                                <div class="sender-name">
                                    <p>firtname lastname</p>
                                </div>

                                <div class="subject-line">
                                    eMAIL subject line
                                </div>
                            </button>
                        </li>
                        <li class=".email-summary">
                            <button type="submit">
                                <div class="sender-name">
                                    <p>firtname lastname</p>
                                </div>

                                <div class="subject-line">
                                    eMAIL subject line
                                </div>
                            </button>
                        </li>
                        <li class=".email-summary">
                            <button type="submit">
                                <div class="sender-name">
                                    <p>firtname lastname</p>
                                </div>

                                <div class="subject-line">
                                    eMAIL subject line
                                </div>
                            </button>
                        </li>
                        <li class=".email-summary">
                            <button type="submit">
                                <div class="sender-name">
                                    <p>firtname lastname</p>
                                </div>

                                <div class="subject-line">
                                    eMAIL subject line
                                </div>
                            </button>
                        </li>

                    </ul>

                </form>


                <div class="compose-email" id="compose">
                    
                    <form action="SendEmail.do" method="POST">

                        <div class="reciever">

                            <select id="reciever" name="recipients" required="" >
                                <%  for (SystemUser recepient : allUsers) {
                                %>
                                <option name="receipients" ><%=recepient.getEmailAddress()%></option>
                                <%
                                    }
                                %>
                            </select>
                        </div>

                        <div class="subject">

                            <input type="text" name="subject" placeholder="Subject line (Optional)" >
                        </div>

                        <div class="body">
                            <textarea name="content" placeholder="Type something here "></textarea>
                        </div>

                        <div class="attachment">
                            <input type="file" name="attachments" 
                                   accept="image/png,image/jpeg,image/jpg,document/doc,document/pdf" 
                                   multiple="multiple">
                        </div>

                        <div class="btn">
                            <input type="submit" value="Send Email">
                        </div>
                    </form>
                </div>

            </div>

        </div>
        <script src="Pages/script.js"></script>
    </body>
</html>
