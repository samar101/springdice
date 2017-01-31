<%-- 
    Document   : dicepokerbasic
    Created on : 29 Jan, 2017, 7:35:21 PM
    Author     : Asus
--%>

<%@ include file = "/WEB-INF/jsp/fragments/jspheader.jspf" %>
<%@ include file = "/WEB-INF/jsp/fragments/resources.jspf" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
       
        <title>Dice Poker</title>
    <h1>Dice Poker</h1>
     <script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="${pokerdiceJs}"></script>
    </head>
    <body onload="loadvetting()">
        <div id="sysdierollarea"> Click to let System Roll the die :<button id="sysdieroll" onclick="getsyspentaroll()">System Roll</button></div>
        <div id="sysdierolldisplay">
            <table border="0">
                
                    <tr>
                        <th><div class="dice" id="sysdiceone" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                        <th><div class="dice" id="sysdicetwo" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                        <th><div class="dice" id="sysdicethree" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                        <th><div class="dice" id="sysdicefour" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                        <th><div class="dice" id="sysdicefive" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                    </tr>
                
            </table>
        </div>
        <div id="userbetamountdiv"> <t>Enter your Bet Amount : </t><input type="text" id="dicepokerbetamt"></div>
        <div id="userdierollarea">Click to get your die roll: <button id="userdieroll" onclick="getuserpentaroll()">Your Die Roll</button></div>
        <div id="userdierolldisplay"><table border="0">
                
                    <tr>
                        <th><div class="dice" id="userdiceone" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                        <th><div class="dice" id="userdicetwo" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                        <th><div class="dice" id="userdicethree" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                        <th><div class="dice" id="userdicefour" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                        <th><div class="dice" id="userdicefive" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                    </tr>
                
            </table></div>
        <div id="rewardarea">Click to Know your Reward: <button id="Reward" onclick="getRewardPayout()">Know My Reward</button></div>
        <div></div>
        
    </body>
</html>
