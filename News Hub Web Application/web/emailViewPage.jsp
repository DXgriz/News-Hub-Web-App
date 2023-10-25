<%-- 
    Document   : emailViewPage
    Created on : Oct 14, 2023, 8:55:02 AM
    Author     : vuyan
--%>


<%@page import="com.news.hub.entities.Email"%>
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

    </head>
    <body>

        <%
            SystemUser user = (SystemUser) session.getAttribute("user");
            List<SystemUser> allUsers = (List<SystemUser>) session.getAttribute("allUsers");
            List<Email> userEmails = (List<Email>) session.getAttribute("userEmails");
            

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
                <form action="ViewEmailServlet.do" id="form" method="post">
                    <ul>
                        
                        <%
                            for(Email email : userEmails)
                            {
                        %>
                        <li class=".email-summary">
                            <button type="submit"value="<%=email.getEmailId()%>" name="emailId">
                                <div class="sender-name">
                                    <p><%=
                                        email.getSender().getFirstName()+" "+ email.getSender().getLastName()
                                        %> 
                                    </p>
                                </div>

                                <div class="subject-line">
                                    <%=
                                       email.getSubjectLine()
                                    %>
                                </div>
                            </button>
                        </li>
                        <%}
                        %>


                    </ul>

                </form>


                <div class="compose-email" id="compose">
                    
                    <form action="SendEmail.do" method="POST" enctype="multipart/form-data">

                        <div class="reciever">
                            <p>To: </p>
                            <select id="reciever" name="recipients" required="" >
                                <%  for (SystemUser recepient : allUsers) {
                                %>
                                <option name="receipients" ><%=recepient.getEmailAddress()%></option>
                                <%
                                    }
                                %>
                            </select>
                            <button class="cancel-btn" id=" "><b>X</b></button>
                        </div>

                        <div class="subject">

                            <input type="text" name="subject" placeholder="Subject line (Optional)" >
                        </div>

                        <div class="body">
                            <textarea name="content" placeholder="Type something here "></textarea>
                        </div>

                        <div class="attachment">
                            <input type="file" name="attachment" 
                                   accept="image/png,image/jpeg,image/jpg,document/doc,document/pdf" 
                                   multiple="multiple">
                        </div>

                        <div class="submit-btn">
                            <input type="submit" value="Send Email">
                        </div>
                    </form>
                </div>

            </div>

        </div>
        <script src="Pages/emailScript.js"></script>
    </body>
</html>
