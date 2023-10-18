<%-- 
    Document   : support
    Created on : Oct 18, 2023, 5:40:24 PM
    Author     : vuyan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>support</title>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" 
              integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" 
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="Pages/learneDahboard.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="Pages/home_page.css">
    </head>
    <body>
        <div class="background"></div>

        <div class="container">

            <div class="left-nav">
                <div class="logo-cont">
                    <img src="Pages/logo.png" alt="">
                </div>
            </div>

            <div class="topnav">
                <a href="index.html"><span class="glyphicon glyphicon-home"></span> Home</a>
                <a class="active" href="support.jsp"><span class="glyphicon glyphicon-comment"></span> Support</a>
                <a href="login_signup.jsp"><span class="glyphicon glyphicon-log-in"></span> Sing In</a>
            </div>

            <div class="body-cont">

                <div class="form-control">

                    <form action="SupportServlet.do" method="POST">

                        <div class="input">
                            <input type="email" name="sender" required="" placeholder="Enter your email...">
                        </div>

                        <div class="input-query">
                            <textarea id="query" name="query" placeholder="Write anything here..."></textarea>
                        </div>

                        <div class="input-chk">
                            <input type="checkbox" id="high" name="high" value="high">
                            <label for="high"> High Priority</label><br>
                        </div>
                        
                        <button type="submit" value="Send">Send</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
