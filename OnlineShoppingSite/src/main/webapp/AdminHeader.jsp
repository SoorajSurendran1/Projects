<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://kit.fontawesome.com/d6eaf4a853.js" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css"  href="css/adminheader.css">
<script src="https://kit.fontawesome.com/d6eaf4a853.js" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<div class="head">

<% String email=session.getAttribute("email").toString(); %>
<center><h2>Online Shopping</h2></center>
<nav class="nav">
<ul>
<div class="navb"><i class="fa-solid fa-plus"></i> <a class="aa" href="AddNewProduct.jsp">Add Product</a></div>
<div class="navb"><i class="fa-solid fa-users-viewfinder"></i> <a class="aa" href="ViewAllProduct.jsp">View & Edit</a></div>
<div class="navb"><i class="fa-solid fa-message"></i> <a class="aa" href="">Massage</a></div>
<div class="navb"><i class="fa-solid fa-bag-shopping"></i> <a class="aa" href="">Orders</a></div>
<div class="navb"><i class="fa-solid fa-ban"></i> <a class="aa" href="">Cancel Order</a></div>
<div class="navb"><i class="fa-solid fa-truck-fast"></i> <a class="aa" href="">Delivered Order</a></div>
<div class="navb"><i class="fa-solid fa-right-from-bracket"></i> <a class="aa" href="LogOut.jsp">LogOut</a>
</ul>
</nav>
</div>


</div>
</html>