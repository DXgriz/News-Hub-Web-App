/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
let compose = document.getElementById("compose");
let leftSide = document.getElementById("left-side");
let topNave = document.getElementById("topNav");

document.getElementById("composeBtn").addEventListener("click",function(){

    compose.classList.toggle("visible");
    leftSide.classList.toggle("blur");
    topNave.classList.toggle("blur");
    document.getElementById("form").classList.toggle("blur");
});
