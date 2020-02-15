<%-- 
    Document   : SelectQuestion
    Created on : 1-Oct-2017, 2:42:02 PM
    Author     : jinda
--%>
<%@page import="source.beans.*"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>The Question Page</title>
        <style>
            h2{font-family: "Times New Roman", Times, serif; font-size:28pt; font-style:italic ;text-align: center;color:
                   #FF1493;}
            body  {
                background-image: url("https://static.vecteezy.com/system/resources/previews/000/101/241/non_2x/free-abstract-background-4-vector.jpg");

            }
            h1{font-family: courier; font-size:26pt; text-align: center;color:
                   blue;}
            table{border-spacing: 45px; }
            input[type="button"] {
                width: 380px;
                height: 70px;
                font-size:16pt;
                background-color: 	#6495ED;
                border: 1.5px solid purple;
                color: black;
                margin-left: 1.8cm;
                text-decoration:none;
                display: inline-block;
                border-radius: 15px;

                cursor: pointer;
            }
            input[type="SUBMIT"] {
                width: 220px;
                height: 70px;
                font-size:16pt;
                background-color: 	#7FFFD4;
                border: 1.5px solid purple;
                color: black;
                margin-left: 1.8cm;
                text-decoration:none;
                display: inline-block;
                border-radius: 15px;

                cursor: pointer;
            }
        </style>
    </head>
    <body>
        <% Player client = (Player) session.getAttribute("class");%>
        <% Question c = (Question) session.getAttribute("question");%>
        <pre><h2> There You GO!                                     Your score:<%=client.getScore()%></h2></pre>
        <br>
        <pre><h1> <%=c.getQuestion()%></h1></pre>

        <form action="AnswerSelect">
            <table align="center">

                <tr>
                    <td><form action="AnswerSelect" >
                            <input type="hidden" name="type2"  value="1"/>
                        <input type="SUBMIT" value="<%=c.getAnswer1()%>"/></td></form>
                    <td><form action="AnswerSelect" >
                            <input type="hidden" name="type2"  value="2"/>
                        <input type="SUBMIT" value="<%=c.getAnswer2()%>"/></td></form>
                </tr>
                <tr>
                    <td><form action="AnswerSelect" >
                            <input type="hidden" name="type2"  value="3"/>
                        <input type="SUBMIT" value="<%=c.getAnswer3()%>"/></td></form>
                    <td><form action="AnswerSelect" >
                            <input type="hidden" name="type2"  value="4"/>
                        <input type="SUBMIT" value="<%=c.getAnswer4()%>"/></td></form>
                </tr>

            </table>
            <br><br>
            <input type="SUBMIT" name="type3" value="Skip Question" />
        </form>
                <script>
    function myFunction(){
       setTimeout(function(){
           alert("Hint:- "+"${question.hint}");
       },30000); 
      
    }
    myFunction();
    </script>
    </body>
    
</html>
