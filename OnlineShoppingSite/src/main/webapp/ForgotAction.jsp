<%@page import="com.mysql.cj.xdevapi.PreparableStatement"%>
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
String name=request.getParameter("name");
String email=request.getParameter("email");
String number=request.getParameter("number");
String sqn=request.getParameter("qn");
String ans=request.getParameter("ans");
String nwpwd=request.getParameter("nwpwd");
int i=0;
   try
   {
	   Connection con=Connect.getConnet();
	   Statement st=con.createStatement();
	   ResultSet rs=st.executeQuery("select * from userproduct where name='"+name+"' && email='"+email+"' && mobileno='"+number+"' && sqn='"+sqn+"' && anw='"+ans+"'");
		while(rs.next())
		{
			i=1;
			st.executeUpdate("update userproduct set password='"+nwpwd+"' where email='"+email+"'");
			response.sendRedirect("ForgetPassword.jsp?msg=done");
		}
		if(i==0)
		{
			response.sendRedirect("ForgetPassword.jsp?msg=invalid");
		}
   }
   catch(Exception e)
 
   {
	   out.print(e);
   }
%>
</body>
</html>