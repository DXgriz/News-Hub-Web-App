<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login or Sign up</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Pages/login.css" type="text/css"/>
    </head>
    <body>
        <!-- ############################################################################################# -->

        <div class="signup-form">

            <form action="RegisterServlet.do" method="POST">

                <div class="input">
                    <input type="text" name="firstname" placeholder="First name" required="">
                </div>
                <div class="input">
                    <input type="text" name="lastname"  placeholder="Last name" required="">
                </div>
                <div class="input">
                    <input type="text" name="identity" placeholder="ID or Passport Number" required="" maxlength="13" minlength="13">
                </div>
                <div class="input">
                    <input type="email" name="email" placeholder="Email address" required="">
                </div>
                <!-- ############################################################################################# -->
                <div class="input">
                    <select id="userType" name="userType" onselect="onOptionSelect()" required="">
                        <option >--Select type--</option>
                        <option value="student">Student</option>
                        <option value="staff">Staff</option>
                    </select>
                </div>
                <!-- #######################Staff extra details#############################-->

                <div class="input invisible" id="staffNumber">
                    <input type="text" name="staffNumber" placeholder="Staff Number" />
                </div>
                <div class="input invisible" id="jobTitle">
                    <input type="text" name="occupation" placeholder="Occupation" />
                </div>

                <!--#########################################################################-->

                <!-- #######################Student extra Details#############################-->

                <div class="input invisible" id="faculty">
                    <input type="text" name="studentNumber"  placeholder="Student Number" />
                </div>
                <div class="input invisible" id="course">
                    <input type="text" name="course" placeholder="Course" />
                </div>
                <div class="input invisible" id="level">
                    <input type="text" name="level" placeholder="Academic level" />
                </div>




                <!--#########################################################################-->

                <div class="input">
                    <input type="password" name="password" placeholder="Password" required="" id="userpassword">
                </div>

                <div class="input">
                    <input type="password" name="confirm password" placeholder="Confirm password" required="" id="passconfirmation">
                </div>
                
                <span>
                    <c:if test="${not empty requestScope.registrationError}">
                        <div class="error-message" style=" position: absolute; right: 5%;color: red;">
                            ${requestScope.registrationError}
                        </div>
                    </c:if>
                </span>

                <button type="submit" id="createAccBtn" style="background-color: rgba(0, 255, 255, 0.5); position: relative; width: 20%;height: 5%; border: none; border-radius: 50px; margin-left: 25%; margin-top: 5%; " class="sub-button">submit</button>

                <button onclick="showSignUp()" style="background-color: var(--first-additinal); position: relative; width: 20%;height: 5%; border: none; border-radius: 50px; margin-right: 25%; margin-top: 5%;" class="sub-button">Login</button>
            </form>
        </div>

        <!-- ############################################################################################# -->


        <div class="left-side" id="left-side">
            <div class="outside-design">
                <div class="design-container">
                    <img src="Pages/graduation.png" alt="">
                </div>
            </div>
        </div>

        <!-- ############################################################################################# -->


        <div class="login-box" id="login-box">
            <div class="logo">
                <img src="Pages/logo.png" alt="logo_image">  
            </div>
            <form action="LoginServlent.do" method="POST">
                <div class="input">
                    <input type="email" name="email" placeholder="Please enter your email" required="">
                </div>
                <div class="input">
                    <input type="password" name="password" placeholder="Please enter your password" required="">
                </div>
                <button id="submit-btn" type="submit">
                    Log in
                </button>
                <a href="resetPassword.jsp">Forgot password</a>
                <hr>
                <span>
                    <c:if test="${not empty requestScope.loginError}">
                        <div class="error-message" style="position: absolute; right: 5%;color: red;">
                            ${requestScope.loginError}
                        </div>
                    </c:if>
                </span>

            </form>
            <button id="create-acc" onclick="showSignUp()">Create new Account</button>
        </div>
        <!-- ############################################################################################# -->

        <script src="Pages/script.js"></script>

    </body>
</html>