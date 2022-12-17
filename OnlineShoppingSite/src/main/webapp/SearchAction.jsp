<%@ include file="headhome.jsp" %>
<%@ include file="foothome.jsp" %>
<%@page import="com.all.connecting.Connect"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/vweproduct.css">
<script src="https://kit.fontawesome.com/d6eaf4a853.js" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1><i class="fa-solid fa-house"></i> Home</h1></center>
<table>
 <tr>
 <th>Id</th><th>Product Name</th><th>Category</th><th>Price</th><th>Add to Cart</th>
 </tr>
 <%
 int z=0;
 try
 {
	 String search=request.getParameter("search");
	 Connection con=Connect.getConnet();
	 Statement st=con.createStatement();
	 ResultSet rs=st.executeQuery("select * from product_table where name like'%"+search+"%' or category like'%"+search+"%' and active='yes'");
	 while(rs.next())
	 {
		 z=1;
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
	 out.print(e);
 }
 %>
 </table>
 <%
 	 if(z==0)
	 {%>
	      <center><h2>There is No Products..!</h2></center><%
	 } %>
</body>
</html>