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
            <form action="RegisterAccount.do" >
                <div class="input">
                    <input type="text" name="firstname" placeholder="First name" required="">
                </div>
                <div class="input">
                    <input type="text" name="lastname"  placeholder="Last name" required="">

                </div>

                <div class="input">
                    <input type="email" name="email" placeholder="Email address" required="">
                </div>
                <!-- ############################################################################################# -->
                <div class="input">
                    <select id="userType" name="userType" onselect="onOptionSelect()">
                        <option value="0">--Select type--</option>
                        <option value="student">Student</option>
                        <option value="staff">Staff</option>
                    </select>
                </div>
                <!-- #######################Staff extra details#############################-->
                    <div class="input" id="staffNumber">
                        <input type="text" name="StaffNumber" placeholder="Staff Number" required="">
                    </div>
                    <div class="input" id="jobTitle">
                        <input type="text" name="jobTitle" placeholder="Occupation" required="">
                    </div>
                <!--#########################################################################-->
                
                <!-- #######################Student extra Details#############################-->
                    <div class="input" id="faculty">
                        <input type="text" name="faculty"  placeholder="Faculty" required="">
                    </div>
                    <div class="input" id="course">
                        <input type="text" name="course" placeholder="Course" required="">
                    </div>
                    <div class="input" id="level">
                        <input type="text" name="level" placeholder="Academic level" required="">
                    </div>
                <!--#########################################################################-->
                
                <div class="input">
                    <input type="password" name="password" placeholder="Password" required="">
                </div>

                <div class="input">
                    <input type="password" name="confirm password" placeholder="Confirm password" required="">
                </div>

                <button type="submit">sign up</button>

                <button onclick="showSignUp()">Login</button>
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
            <form action="">
                <div class="input">
                    <input type="email" name="emai" placeholder="Please enter your emai" required="">
                </div>
                <div class="input">
                    <input type="password" name="password" placeholder="Please enter your passowrd" required="">
                </div>
                <button id="submit-btn" type="submit">
                    Log in
                </button>
                <a href="">Forgotten password</a>
                <hr>

            </form>
            <button id="create-acc" onclick="showSignUp()">Create new Account</button>
        </div>
<!-- ############################################################################################# -->

        <script src="Pages/script.js"></script>

    </body>
</html>