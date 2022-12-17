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
    String email=request.getParameter("email");
    String pwd=request.getParameter("pwd");
    if("admin@gmail.com".equals(email)&&"admin".equals(pwd))
    {
    	session.setAttribute("email", email);
    	response.sendRedirect("Admin.jsp");
    }
    else
    {
    	int z=0;
    	 try
    	 {
    		 Connection con=Connect.getConnet();
    		 Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from userproduct where email='"+email+"'&& password='"+pwd+"'");
    		while(rs.next())
    		{
    			z=1;
    			session.setAttribute("email", email);
    			response.sendRedirect("home.jsp");
    		}
    		if(z==0)
    		{
    			response.sendRedirect("UserLogin.jsp?msg=incorrect");
    		}
    	 }
    	 catch(Exception e) 
    	 {
    		 out.print(e);
    		 response.sendRedirect("UserLogin.jsp?msg=invalid");
    	 }
    }


%>
</body>
</html>