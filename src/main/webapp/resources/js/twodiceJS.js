
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
var ajaxresp;
var systemthrow;
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

function rolltwosysdice() {
    validate();

    twodiceajaxcall();
    alert("ok out");




}

function  validate() {




}

function twodiceajaxcall() {
    var b = $("#doubledicebetamt").val();
    var g = $("#twodiceuserguess").val();
    $.ajax({
        url: "doublethrowcall",
        method: "POST",

        data: {'betamount': b, 'userguess': g},
        dataType: 'json',
        success: function (doublediceresponse) {
            alert(doublediceresponse.firstsysThrow);
            $("#sysdiceone").html(dice[doublediceresponse.firstsysThrow]);
            $("#sysdicetwo").html(dice[doublediceresponse.secondsysThrow]);
            $("#doubledicestat").html("your throw is " + doublediceresponse.userguess + " system total count is " + doublediceresponse.total + " your reward is " + doublediceresponse.betreward);
        },
        done: function (doublediceresponse) {
            ajaxresp = doublediceresponse;
            alert("ajax done");
        }

    });
}

//$("#but").on('click', rolldice());
