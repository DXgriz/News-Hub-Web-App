<%-- 
    Document   : resetPassword
    Created on : 05 Nov 2023, 6:34:13 PM
    Author     : andil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Pages/login.css" type="text/css"/>
    </head>
    <body>
    
        <div class="left-side" id="left-side">
            <div class="outside-design">
                <div class="design-container">
                    <img src="Pages/graduation.png" alt="">
                </div>
            </div>
        </div>

        <!-- ############################################################################################# -->


        <div class="login-box" id="login-box">
            
            <form action="ResetPassword.do" method="POST">
                <div class="input">
                    <input type="email" name="email" placeholder="Please enter your email" required="">
                </div>
                <div class="input">
                    <input type="text" name="id" placeholder="Please enter your ID number"  required="">
                </div>
                <div class="input">
                    <input type="password" name="password" placeholder="New password" required="">
                </div>
                <button id="submit-btn" type="submit">
                    Reset
                </button>
                
                <span>
                    <c:if test="${not empty requestScope.loginError}">
                        <div class="error-message" style="position: absolute; right: 5%;color: red;">
                            ${requestScope.loginError}
                        </div>
                    </c:if>
                </span>

            </form>
            
        </div>

    </body>
</html>