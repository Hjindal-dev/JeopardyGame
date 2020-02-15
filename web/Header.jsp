<%-- 
    Document   : Header
    Created on : 10-Nov-2017, 3:53:39 PM
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
            h1{font-family: times, serif; font-size:28pt; font-style:italic ;text-align: center;color:
                   blue;}
            form {
                text-align: center;
                font-size:24pt; 
                font-style:italic;

            }
            body  {
                background-image: url("https://image.freepik.com/free-vector/abstract-background-with-a-geometric-design_1048-3422.jpg");

            }
        </style>
    </head>
    <body>
        <% Player client = (Player) session.getAttribute("class");%>
        <%int max = client.getScore();%>
        <h1>There comes a Daily Double Question!</h1>
        <p align="center"><img src="DailyDouble.jpg" width="600" height="400" alt="WinImage"/></p>
        <form action="PickQuestion" style="color:#8B008B">
            <% if (client.getScore() < 1000) {%>
            How much points do u want to assign this question?
            <input type="number" name="number" min="0" max="1000">
            <%} else {%>
            How much points do u want to assign this question?
            <input type="number" name="number" min="0" max=<%=max%>
                   <%}%>

                   <br><br>
            <input type="hidden" name="double" value="setValue"/>
            <input type="SUBMIT" value="Set Value"/>
        </form>
    </body>
</html>

