<%-- 
    Document   : composeEmail
    Created on : Oct 16, 2023, 8:46:12 AM
    Author     : vuyan
--%>

<%@page import="java.util.List"%>
<%@page import="com.news.hub.entities.SystemUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compose Email</title>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" 
              integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" 
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="Pages/learneDahboard.css">

        <style>
            .body-cont{
                border:solid;
                border-color: #1b4ffa;
                align-content: center;
                border-radius: 5%;
                height: 75%;
            }
        </style>
    </head>
    <body>
        <div class="background"></div>

        <div class="container">
            <div class="left-nav">
                <div class="logo-cont">
                    <img src="Pages/logo.png" alt="">
                </div>
            </div>

            <!--
            END : LEFT-NAV
            START: TOP-NAV
            -->

            <div class="top-nav">
                <a href="emailViewPage.jsp">Cancel</a>
            </div>

            <!--
            END : TOP-NAV
            START : BODY-CONT
            -->
            <div class="text">
                <h5 style="color:red;">New Message</h5>
            </div>
            <%
                SystemUser user = (SystemUser) session.getAttribute("user");
                List<SystemUser> allUsers = (List<SystemUser>) session.getAttribute("allUsers");

            %>
            <div class="body-cont">

                <form action="SendEmail.do" method="POST">

                    <div class="input">
                        <select id="userAccount" name="userAccount" onselect="onOptionSelect()" required="" >
                            <option value="userAccount" ><%=user.getEmailAddress()%></option>
                        </select>
                    </div>

                    <div class="input">
                        <select id="receipients" name="receipients" onselect="onOptionSelect()" required="" >
                            <%
                                for (SystemUser recepient : allUsers) {
                            %>
                            <option value="receipients" ><%=recepient.getEmailAddress()%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="input">
                        <input type="text" name="subjectLine" placeholder="Subject Line here" required="" height="5">
                    </div>

                    <div class="input">
                        <textarea id="emailBody" name="emailBody" rows="70" cols="90"></textarea>
                    </div>
                        
                    <div class="input">
                        <input type="file" name="attachments" 
                               accept="image/png,image/jpeg,image/jpg,document/doc,document/pdf" 
                               multiple="multiple">
                    </div>

                    <button type="submit" value="Send">Send</button>
                </form>
            </div>
        </div>
    </body>
</html>
