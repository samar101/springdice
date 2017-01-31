<%-- 
    Document   : doubledice
    Created on : 26 Jan, 2017, 8:20:29 PM
    Author     : Asus
--%>
<%@ include file = "/WEB-INF/jsp/fragments/jspheader.jspf" %>
<%@ include file = "/WEB-INF/jsp/fragments/resources.jspf" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div><t>Enter your Bet Amount : </t><input type="text" name="doubledicebetamt" id="doubledicebetamt" value="" /></div>
        <div> <t>Enter your Outcome : </t><input type="range" id="twodiceuserguess" min="1" max="12" step="1" ></div>
        <div><table border="0">

                <tr>
                    <th><div class="dice" id="sysdiceone" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                    <th><div class="dice" id="sysdicetwo" style="width: 200px; height: 200px; font-size: 128px"></div></th>
                </tr>

            </table>
        </div>
        <div id="doubledicestat"></div>
        <div><input type="submit" value="Roll" name="rolltwosysdice" onclick="rolltwosysdice()" /></div>
        <script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="${twodiceJs}"></script>
    </body>
</html>
