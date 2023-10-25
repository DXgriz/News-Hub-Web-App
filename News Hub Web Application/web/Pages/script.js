
let userType = document.getElementById("userType");
let level = document.getElementById("level");
let course = document.getElementById("course");
let faculty = document.getElementById("faculty");
let staffNumber = document.getElementById("staffNumber");
let jobTitle = document.getElementById("jobTitle");
let userpassword = document.getElementById("userpassword");
let passconfirmation = document.getElementById("passconfirmation");
let createAccBtn = document.getElementById("createAccBtn");
let compose = document.getElementById("compose");
let leftSide = document.getElementById("left-side");
let topNave = document.getElementById("topNav");
/**/


userType.addEventListener("change",function(){
    
    if(userType.value === "student")
    {
        //document.getElementById("test").classList.toggle("invisible");
        level.classList.remove("invisible");
        course.classList.remove("invisible");
        faculty.classList.remove("invisible");

        staffNumber.classList.add("invisible");
        jobTitle.classList.add("invisible");
                
    }else if(userType.value === "staff")    {
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

document.getElementById("composeBtn").addEventListener("click",function(){

    compose.classList.toggle("visible");
    leftSide.classList.toggle("blur");
    topNave.classList.toggle("blur");
    document.getElementById("form").classList.toggle("blur");
});



passconfirmation.addEventListener("input",() => {
    
  if( passconfirmation.value.length <= userpassword.value.length && passconfirmation.value !== userpassword.value)
    {
        //Make button unclickable
        createAccBtn.disabled = true;

        if( passconfirmation.value.length === userpassword.value.length)
        {
            alert("Incorrect password");
        }

    }else
    {
        //Re activate button
        createAccBtn.disabled = false;
    }

});





function showSignUp(){
    let left = document.getElementById("left-side");
    let loginBox = document.getElementById("login-box");

    loginBox.classList.toggle('no-display');
    left.classList.toggle('signup');        

    }
    
  

