// jQuery
function  loadvetting(){
  
  $("#userdierollarea").hide();
  $("#userdierolldisplay").hide();
  $("#rewardarea").hide();
  
}
$(window).on("load", loadvetting());
var dice = {
    1: '&#9856;',
    2: '&#9857;',
    3: '&#9858;',
    4: '&#9859;',
    5: '&#9860;',
    6: '&#9861;'
};

var n;
var p;
var q;
var times = 0;
var systempentathrowajaxresp;
var userpentathrowajaxresp;
var userguess;
var betrwrd;
var betamt;


var possibleNextFaces = {
    1: [2, 3, 4, 5],
    2: [1, 3, 4, 6],
    3: [1, 2, 5, 6],
    4: [1, 2, 5, 6],
    5: [1, 3, 4, 6],
    6: [2, 3, 4, 5]
};

//function random(prev){
//  prev = prev || 0;
//  var n = Math.floor(Math.random() * 6) + 1;
//  if(!prev){
//    return n;
//  }
//  if(possibleNextFaces[prev].indexOf(n) > -1){
//    return n;
//  }else{
//    return random(prev);
//  }
//}
//
//function roll(){
//     
//  
//  n = random();
//  document.getElementById("dice").innerhtml(dice[n]);
//  if(times<20){
//   times++;
//   roll();
//   }else{
//    times = 0;
//  }
//  
//}

 

function  validatebetamount() {




}


function getsyspentaroll() {
    
    if($("#dicepokerbetamt").isNumeric()){
    var b = $("#doubledicebetamt").val();
    var g = $("#twodiceuserguess").val();
    $.ajax({
        url: "syspentathrowcall",
        method: "POST",

        data: {'betamount': b, 'userguess': g},
        dataType: 'json',
        success: function (systempentadiceresponse) {
            $("#sysdiceone").html(dice[systempentadiceresponse.dicerollone]);
            $("#sysdicetwo").html(dice[systempentadiceresponse.dicerolltwo]);
            $("#sysdicethree").html(dice[systempentadiceresponse.dicerollthree]);
            $("#sysdicefour").html(dice[systempentadiceresponse.dicerollfour]);
            $("#sysdicefive").html(dice[systempentadiceresponse.dicerollfive]);
            $("#userdierollarea").show();
            $("#userdierolldisplay").show();
            
        },
        done: function (systempentadiceresponse) {
            systempentathrowajaxresp = systempentadiceresponse;
            alert("ajax done");
        }

    });
    }
}

function getuserpentaroll() {
    
    var b;
    var g;
    
     $.ajax({
        url: "userpentathrowcall",
        method: "POST",

        data: {'betamount': b, 'userguess': g},
        dataType: 'json',
        success: function (userpentadiceresponse) {
            
            $("#userdiceone").html(dice[userpentadiceresponse.dicerollone]);
            $("#userdicetwo").html(dice[userpentadiceresponse.dicerolltwo]);
            $("#userdicethree").html(dice[userpentadiceresponse.dicerollthree]);
            $("#userdicefour").html(dice[userpentadiceresponse.dicerollfour]);
            $("#userdicefive").html(dice[userpentadiceresponse.dicerollfive]);
            $("#rewardarea").show();
        },
        done: function (userpentadiceresponse) {
            userpentathrowajaxresp = userpentadiceresponse;
            alert("ajax done");
        }

    });
    
}

function getRewardPayout(){
    
    var b=$("#dicepokerbetamt").val();
    var g;
    
    $.ajax({
        url: "dicepokerbasicreward",
        method: "POST",

        data: {'dicepokerbetamt': b},
        dataType: 'json',
        success: function (rewardpayoutresponse) {
            
           
            
        },
        done: function (rewardpayoutresponse) {
            
        }

    });
    
    
}



//$("#but").on('click', rolldice());
