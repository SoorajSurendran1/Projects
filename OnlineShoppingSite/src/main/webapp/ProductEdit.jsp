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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try
{
	String id=request.getParameter("id");
	Connection con=Connect.getConnet();
	Statement at=con.createStatement();
	ResultSet rs=at.executeQuery("select * from product_table where id='"+id+"'");
	while(rs.next())
	{
%>
<form action="EditProductAction.jsp" method="post">
<input type="hidden" name="id" value="<%=rs.getString(1)%>">
<div><h3>Enter Name</h3>
<input type="text" name="name" value="<%=rs.getString(2)%>">
</div>
<div><h3>Category</h3>
<input type="text" name="category" value="<%=rs.getString(3)%>""></div>
<div><h3>Price</h3>
<input type="number" name="price" value="<%=rs.getString(4)%>"></div>
<div><h3>Active</h3>
<select name="active"><option value="yes">yes</option><option value="no"">no</option>
</select></div>
<input type="submit" value="Save">
</form>
<%
	}
}
catch(Exception e)
{
}
%>


</body>
</html>