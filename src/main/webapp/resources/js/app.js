$(document).ready(function(){
	
	$('#testjsbutton').click(function() {
		alert('JS is working!');
                ajaxcall();
	});
	
});

function ajaxcall(){
     $.ajax({  
        url : "ajaxcall",   
        method : "GET",   
        
        contentType: 'application/json',
        data: {organizationId : 3 },    
        success : function(response) {  
            alert(response);   
         },  
         error : function(e) {  
          alert('Error: ' + e);   
         }  
    });
            
    
           
    
}