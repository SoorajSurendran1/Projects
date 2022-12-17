<%@ include file="AdminHeader.jsp" %>
<%@ include file="AdminFooter.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.all.connecting.Connect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"  href="css/addpro.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String msg=request.getParameter("msg");
if("done".equals(msg))
{%><h1 class="good">Successfully Added</h1>
<%}
if("invalid".equals(msg))
{%><h1 class="bad">Something Problem..!</h1>
<%} %>
<%
 int i=1;
  try
  {
	  Connection con=Connect.getConnet();
	  Statement st=con.createStatement();
	  ResultSet rs=st.executeQuery("select max(id) from product_table");
	  while(rs.next())
	  {
		  i=rs.getInt(1);
		  i=i+1;
	  }
  }
  catch(Exception e)
  {
	  out.print(e);
  }
%>
<h3 class="head22">Product ID:<%out.print(i); %></h3>
<form action="AddProductAction.jsp" method="post">
<input type="hidden" name="id" value="<% out.print(i);  %>">
<div class="fix">
<div class="left"><h3>Product</h3>
<input type="text" name="name" placeholder="Produt Name">
</div>
<div class="left"><h3>Category</h3>
<input type="text" name="category" placeholder="Enter category"></div>
<div class="left"><h3>Price</h3>
<input type="number" name="price" placeholder="Enter Price"></div>
<div class="left"><h3>Active</h3>
<select name="active"><option>yes</option><option>no</option>
</select></div>
</div>
<input class="but" type="submit" value="Save">
</form>
</body>
</html>