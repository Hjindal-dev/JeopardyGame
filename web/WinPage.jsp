<%-- 
    Document   : WinPage
    Created on : 23-Oct-2017, 2:33:59 PM
    Author     : jinda
--%>

<%@page import="source.beans.Player"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>

body  {
    background-image: url("https://www.xmple.com/wallpaper/white-linear-green-gradient-1920x1080-c2-66cdaa-ffffff-a-180-f-14.svg");
    
}
p{font-family: "Times New Roman", Times, serif; font-size:28pt; font-style:italic ;text-align: center;color:
                   #FF1493;}
</style>
    </head>
    
    <body>
        <h1 align="center">Lets see your winnings!</h1>
        <% Player client = (Player)session.getAttribute("class");%>
        
        <% if(client.getScore()<=4000) {%>
        <p align="center"><img src="http://www.troll.me/images/success-kid/almost-a-win-better-luck-next-time.jpg" width="450" height="450" alt="Try Harder"></p>
        <%} else {%>
        <p align="center"><img src="WinPage.png" width="400" height="400" alt="WinImage"/></p>
        <%}%>
        
	
        
       <pre> <p>And you scored: <%=client.getScore()%>! </p></pre>
    </body>
</html>
