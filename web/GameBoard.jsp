<%-- 
    Document   : GameBoard
    Created on : 1-Oct-2017, 1:10:46 PM
    Author     : jinda
--%>
<%@page import="source.beans.Player"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>The Game Page</title>
<style>

body  {
    background-image: url("http://www.qygjxz.com/data/out/18/5769022-background-image.png");
    
}

h2{font-family: "Times New Roman", Times, serif; font-size:28pt; font-style:italic ;text-align: center;color:
green;}
th{font-family:times, serif; font-size:20pt;color:blue;}
input[type="SUBMIT"] {
    width: 140px;
    height: 80px;
	font-size:20pt;
	background-color: 	#F08080;
    border: 2px solid purple;
    color: black;
    margin-left: 1.8cm;
    text-decoration:none;
    display: inline-block;
    border-radius: 15px;

    cursor: pointer;
}
table{border-spacing: 15px;}

</style>
</head>
<body>


<% Player client = (Player)session.getAttribute("class");%>

<pre><h2> WElCOME <%=client.getName()%>!                                     Your score:<%=client.getScore()%></h2></pre>
<form action="PickQuestion">
<table style="width:100%">
  <tr>
    <th>General Knowledge</th>
    <th>Java</th> 
    <th>Maths</th>
	<th>Science</th>
	<th>Sports</th>
  </tr>
  <tr>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="0"/>
			<input type="SUBMIT" value="$ 100 $" ${button0} /></td> </pre>
        </form>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="5" />
			<input type="SUBMIT" value="$ 100 $" ${button5} /></td> </pre>
        </form>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="10" />
			<input type="SUBMIT" value="$ 100 $" ${button10}/></td> </pre>
        </form>
<pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="15" />
			<input type="SUBMIT" value="$ 100 $" ${button15} /></td> </pre>
        </form>
<pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="20" />
			<input type="SUBMIT" value="$ 100 $" ${button20} /></td> </pre>
        </form>
  </tr>
  <tr>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="1"/>
			<input type="SUBMIT" value="$ 200 $" ${button1} /></td> </pre>
        </form>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="6" />
			<input type="SUBMIT" value="$ 200 $" ${button6}/></td> </pre>
        </form>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="11" />
			<input type="SUBMIT" value="$ 200 $" ${button11} /></td> </pre>
        </form>
<pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="16" />
			<input type="SUBMIT" value="$ 200 $" ${button16} /></td> </pre>
        </form>
<pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="21" />
			<input type="SUBMIT" value="$ 200 $" ${button21} /></td> </pre>
        </form>
  </tr>
  <tr>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="2"/>
			<input type="SUBMIT" value="$ 300 $" ${button2}/></td> </pre>
        </form>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="7" />
			<input type="SUBMIT" value="$ 300 $" ${button7} /></td> </pre>
        </form>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="12" />
			<input type="SUBMIT" value="$ 300 $" ${button12} /></td> </pre>
        </form>
<pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="17" />
			<input type="SUBMIT" value="$ 300 $" ${button17} /></td> </pre>
        </form>
<pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="22" />
			<input type="SUBMIT" value="$ 300 $" ${button22}/></td> </pre>
        </form>
  </tr>
  <tr>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="3"/>
			<input type="SUBMIT" value="$ 400 $" ${button3} /></td> </pre>
        </form>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="8" />
			<input type="SUBMIT" value="$ 400 $" ${button8} /></td> </pre>
        </form>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="13" />
			<input type="SUBMIT" value="$ 400 $" ${button13} /></td> </pre>
        </form>
<pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="18" />
			<input type="SUBMIT" value="$ 400 $" ${button18}/></td> </pre>
        </form>
<pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="23" />
			<input type="SUBMIT" value="$ 400 $" ${button23} /></td> </pre>
        </form>
  </tr>
 <tr>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="4"/>
			<input type="SUBMIT" value="$ 500 $" ${button4}/></td> </pre>
        </form>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="9" />
			<input type="SUBMIT" value="$ 500 $" ${button9} /></td> </pre>
        </form>
    <pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="14" />
			<input type="SUBMIT" value="$ 500 $" ${button14}/></td> </pre>
        </form>
<pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="19" />
			<input type="SUBMIT" value="$ 500 $" ${button19}/></td> </pre>
        </form>
<pre><td>  <form action="PickQuestion" >
			<input type="hidden" name="type"  value="24" />
			<input type="SUBMIT" value="$ 500 $" ${button24} /></td> </pre>
        </form>
  </tr>
</table>
</form>

</body>

</html>
