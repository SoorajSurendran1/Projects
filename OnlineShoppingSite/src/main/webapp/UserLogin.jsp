<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/userlogin.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="continer2">
<div class="left2">
<form action="UserLoginAction.jsp" method="post">
<h2 class="head2">User Login</h2>
<input class="change" type="email" name="email" placeholder="Username"><br>
<input class="change" type="password" name="pwd" placeholder="Password"><br>
<input class="sub" type="submit" value="LogIn"><br>
<h3 class="h1"><a href="LoginPage.jsp">Signup</a></h3>
<h3 class="h2"><a href="ForgetPassword.jsp">ForgotPassword...?</a></h3>

</form>
</div>
<div class="right2">
<%
String msg=request.getParameter("msg");
if("incorrect".equals(msg))
{
%><h2 class="bad">Incorrect Email and Password....! </h2>
<%}
if("invalid".equals(msg))
{%><h2 class="bad">Something went Wrong! Please check....!</h2>
<%}%>
<img src="webback.jpg">
</div>
</div>
</body>
</html>