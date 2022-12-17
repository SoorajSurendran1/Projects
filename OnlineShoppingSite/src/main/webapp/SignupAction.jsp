
<%@page import="com.all.connecting.Connect"%>
<%@page import="java.sql.*"%>
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
String pwd=request.getParameter("pwd");
String address="";
String city="";
String state="";
String cntry="";
try
{
	Connection con=Connect.getConnet();
	PreparedStatement st=con.prepareStatement("insert into userproduct(name,email,mobileno,sqn,anw,password,address,city,state,country)value(?,?,?,?,?,?,?,?,?,?)");
	st.setString(1,name);
	st.setString(2, email);
	st.setString(3, number);
	st.setString(4,sqn);
	st.setString(5, ans);
	st.setString(6, pwd);
	st.setString(7, address);
	st.setString(8, city);
	st.setString(9, state);
	st.setString(10, cntry);
	st.executeUpdate();
	response.sendRedirect("LoginPage.jsp?msg=valid");
}
catch(Exception e)
{
   out.print(e);
   response.sendRedirect("LoginPage.jsp?msg=invalid");
  
}


%>
</body>
</html>