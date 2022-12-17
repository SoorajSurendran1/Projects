<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/forgotpassword.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">

<div class="leftside">
<form action="ForgotAction.jsp" method="post">
<h2 class="head1">Change Password</h2>

<input class="change" type="text" name="name" placeholder="Enter Name"><br>
<input class="change" type="email" name="email" placeholder="Enter Email"><br>
<input class="change" type="text" name="number" placeholder="Enter Mobile Number"><br>
<select name="qn">
<option value="In what city were you born?">In what city were you born?</option>
<option value="What is the name of your favorite pet?">What is the name of your favorite pet?</option>
<option value="What was the make of your first car?">What was the make of your first car?</option>
<option value="What is the name of the town where you were born?">What is the name of the town where you were born?</option>
</select><br>
<input class="change" type="text" name="ans" placeholder="Enter the Answer"><br>
<input class="change" type="password" name="nwpwd" placeholder="Change Password"><br>
<input class="sub" type="submit" value="Save"><br>
</form>
</div>
<div class="rightside">
<%
  String msg=request.getParameter("msg");
if("done".equals(msg))
{
%><h1 class="good">Saved Successfully</h1>
<%}
if("invalid".equals(msg))
{%><h2 class="bad">Something Wrong! Please check....!</h2>
<%}
if("error".equals(msg))
{%><h2 class="bad">Error.....!</h2>
<%} %>
<img src="background.jpg">


</div>

</div>
</body>
</html>