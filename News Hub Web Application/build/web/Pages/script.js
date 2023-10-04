
let userType = document.getElementById("userType");
let level = document.getElementById("level");
let course = document.getElementById("course");
let faculty = document.getElementById("faculty");
let staffNumber = document.getElementById("staffNumber");
let jobTitle = document.getElementById("jobTitle");
/*
level.classList.add("invisible");
course.classList.add("invisible");
faculty.classList.add("invisible");
staffNumber.classList.add("invisible");
jobTitle.classList.add("invisible");
*/

userType.addEventListener("change",function(){
    
    if(userType.value === "student")
    {
        //document.getElementById("test").classList.toggle("invisible");
        level.classList.remove("invisible");
        course.classList.remove("invisible");
        faculty.classList.remove("invisible");
        staffNumber.classList.add("invisible");
        jobTitle.classList.add("invisible");
        
    }else if(userType.value === "staff")
    {
        staffNumber.classList.remove("invisible");
        jobTitle.classList.remove("invisible");
        
        level.classList.add("invisible");
        course.classList.add("invisible");
        faculty.classList.add("invisible");
    }else
    {
        level.classList.add("invisible");
        course.classList.add("invisible");
        faculty.classList.add("invisible");
        staffNumber.classList.add("invisible");
        jobTitle.classList.add("invisible");

    }

});


function showSignUp(){
    let left = document.getElementById("left-side");
    let loginBox = document.getElementById("login-box");

    loginBox.classList.toggle('no-display');
    left.classList.toggle('signup');        

    }
    
  

