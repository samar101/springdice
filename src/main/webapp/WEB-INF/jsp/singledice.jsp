<%-- 
    Document   : newjsp
    Created on : 24 Jan, 2017, 9:43:37 PM
    Author     : Asus
--%>
<%@ include file = "/WEB-INF/jsp/fragments/jspheader.jspf" %>
<%@ include file = "/WEB-INF/jsp/fragments/resources.jspf" %>
<%--
<%@page contentType="text/html" pageEncoding="windows-1252"%>
--%>
<!DOCTYPE html>
<html >
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
          
        
      

        <title>Single Dice Roll</title>
    <h1>Single Dice Roll</h1>
</head>
<body>


    
    <div> <t>Enter your Bet Amount : </t><input type="text" id="betamt"></div>
    <div> <t>Enter your Outcome : </t><input type="range" id="userguess" min="1" max="6" step="1"></div>

    <div class="dice" id="dice" style="width: 200px; height: 200px; font-size: 128px"></div>
    <div id="statdiv"style="width:300px;height: 70px;"></div>

    <div><button id="but" onclick="rolldice()">roll</button></div>

    <script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="${diceJs}"></script>
</body></html>

