<%@page import="java.sql.PreparedStatement"%>
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
 String id=request.getParameter("id");
String name=request.getParameter("name");
String category=request.getParameter("category");
String price=request.getParameter("price");
String active=request.getParameter("active");
try
{
	Connection con=Connect.getConnet();
	PreparedStatement pt=con.prepareStatement("update product_table set name='"+name+"',category='"+category+"',price='"+price+"',active='"+active+"' where id='"+id+"'");
	int i=pt.executeUpdate();
	if("no".equals(active))
	{
		pt.executeUpdate("");
	}
	if(i>0)
	{
		response.sendRedirect("ViewAllProduct.jsp?msg=done");
	}
	response.sendRedirect("ViewAllProduct.jsp?msg=invalid");
}
catch(Exception e)
{
	out.print(e);
}




%>
</body>
</html>