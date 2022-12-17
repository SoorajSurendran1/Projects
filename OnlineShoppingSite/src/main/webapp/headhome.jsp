<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"  href="css/home.css">
<script src="https://kit.fontawesome.com/d6eaf4a853.js" crossorigin="anonymous"></script>
</head>
<div class="headho">
<%String email=session.getAttribute("email").toString(); %>
<center><h1 class="h1">Online Shopping</h1></center>
<div class="nav2">
<ul>
<div class="home1"><i class="fa-solid fa-user"></i>  <a href=""><%out.println(email); %></a></div>
<div class="home"><i class="fa-solid fa-house"></i> <a href="home.jsp">Home</a></div>
<div class="home"><i class="fa-solid fa-cart-shopping"></i> <a href="mycart.jsp">My Cart</a></div>
<div class="home"><i class="fa-solid fa-truck-fast"></i> <a href="">My Order</a></div>
<div class="home"><i class="fa-solid fa-address-card"></i> <a href="">Change Details</a></div>
<div class="home"><i class="fa-solid fa-comments"></i> <a href="">Message Us</a></div>
<div class="home"><i class="fa-solid fa-at"></i> <a href="">About</a></div>
<div class="home"><i class="fa-solid fa-right-from-bracket"></i> <a href="LogOut.jsp">logOut</a></div>
<div class="home3">
<form action="SearchAction.jsp" method="post">
<input type="text" name="search" placeholder="Search"><button type="submit"> <i class="fa-solid fa-magnifying-glass"></i></button>
</form>
</div>
</ul>
</div>
</div>


</html>