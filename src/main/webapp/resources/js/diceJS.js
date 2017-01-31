   
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
  1:[2,3,4,5],
  2:[1,3,4,6],
  3:[1,2,5,6],
  4:[1,2,5,6],
  5:[1,3,4,6],
  6:[2,3,4,5]
};

 function dieanime(){
     
     
     
 }

function rolldice(){
    validate();
    
    ajaxcall();
    alert("ok out");
    
}

function  validate(){
    
    
   
    
}

function ajaxcall(){
    var b =$("#betamt").val();
    var g =$("#userguess").val();
     $.ajax({  
        url : "ajaxcall",   
        method : "POST",  
        
        data : {'betamount':b,'userguess':g},   
        dataType : 'json',
        success : function(response) {  
 
        alert(response.systhrow);
     $("#dice").html(dice[response.systhrow]);
    $("#statdiv").html("your throw is "+response.userguess + " system total count is "+response.systhrow);
         },
         done : function(response) {  
          ajaxresp = response;   
            alert("ajax done");
         }
       
    });
}

//$("#but").on('click', rolldice());
