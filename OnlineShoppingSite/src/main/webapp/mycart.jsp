<%@ include file="headhome.jsp" %>
<%@ include file="foothome.jsp" %>
<%@page import="com.all.connecting.Connect"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/viewproduct.css">
<script src="https://kit.fontawesome.com/d6eaf4a853.js" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1><i class="fa-solid fa-cart-shopping"></i> My Cart</h1></center>
<table>
 <tr>
 <th>Product Name</th><th>Quantity</th><th>Price</th><th>ToTal Amount</th><th>Order</th>
 </tr>
 <%
 try
 {
	 String email1=session.getAttribute("email").toString();
	 Connection con=Connect.getConnet();
	 Statement st=con.createStatement();
	 ResultSet rs=st.executeQuery("select * from cart where email='"+email1+"'");
	 while(rs.next())
	 {
%> 
       <tr><td><%=rs.getString(2) %></td>
       <td><%=rs.getString(4)%></td>
       <td><%=rs.getString(5)%></td>
       <td><%=rs.getString(6)%></td>
       <td><i class="fa-solid fa-truck"></i> <a href="">Order</a></td> </tr>     
<%}
 }
 catch(Exception e)
 {
	 
 }
 %>
 </table>
</body>
</html>