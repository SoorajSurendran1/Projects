

<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.all.connecting.Connect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String category=request.getParameter("category");
String price=request.getParameter("price");
String active=request.getParameter("active");

try
{
	Connection con=Connect.getConnet();
	PreparedStatement ps=con.prepareStatement("insert into product_table(id,name,category,price,active)value(?,?,?,?,?)");
	ps.setString(1, id);
	ps.setString(2, name);
	ps.setString(3, category);
	ps.setString(4, price);
	ps.setString(5, active);
	ps.executeUpdate();
	response.sendRedirect("AddNewProduct.jsp?msg=done");
}
catch(Exception e)
{
	response.sendRedirect("AddNewProduct.jsp?msg=invalid");
}
%>
</body>
</html>