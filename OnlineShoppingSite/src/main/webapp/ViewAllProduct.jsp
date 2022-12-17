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
<link rel="stylesheet" type="text/css" href="css/adminviewproduct.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All Product & Edit Product</h2>
<%
String msg=request.getParameter("msg");
if("done".equals(msg))
{%><h3>Edited Successfully</h3>
<%}
if("invalid".equals(msg))
{%><h3>Error</h3>
<%} %>
<table>
 <tr>
 <th>Id</th><th>Product Name</th><th>Category</th><th>Price</th><th>Status</th><th>Edit</th>
 </tr>
 <tr>
<%
try
{
	Connection con=Connect.getConnet();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from product_table");
	while(rs.next())
	{%>
	<td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3) %></td>
	<td><%=rs.getString(4) %></td>
	<td><%=rs.getString(5) %></td>
	<td><a href="ProductEdit.jsp?id=<%=rs.getString(1)%>">Edit</a></td></tr>
		
	<% }
}
catch(Exception e)
{
	
}
%>
</table>
</body>
</html>