<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.all.connecting.Connect"%>
<%@page import="java.sql.Connection"%>
<%@ include file="headhome.jsp" %>
<%@ include file="foothome.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/viewproduct.css">
<script src="https://kit.fontawesome.com/d6eaf4a853.js" crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>
<center><h1><i class="fa-solid fa-house"></i> Home</h1></center>
<%
String msg=request.getParameter("msg");
if("added".equals(msg))
{
%><h3 class="dis">Product Added Successfully <i class="fa-regular fa-circle-check"></i></h3>
<%}
if("exist".equals(msg))
{%><h3 class="dis">Product already exsit in your Cart..! Quantity increased..</h3>
<%}%>
<table>
 <tr>
 <th>Id</th><th>Product Name</th><th>Category</th><th>Price</th><th>Add to Cart</th>
 </tr>
 <%
 try
 {
	 Connection con=Connect.getConnet();
	 Statement st=con.createStatement();
	 ResultSet rs=st.executeQuery("select * from product_table where active='yes'");
	 while(rs.next())
	 {
%> 
       <tr><td><%=rs.getString(1) %></td>
       <td><%=rs.getString(2)%></td>
       <td><%=rs.getString(3)%></td>
       <td><%=rs.getString(4)%></td>
       <td><i class="fa-solid fa-cart-plus"></i> <a href="CartAction.jsp?id=<%=rs.getString(1)%>">Add Cart</a></td> </tr>     
<%}
 }
 catch(Exception e)
 {
	 
 }
 %>
 </table>
</body>
</html>