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
String email=session.getAttribute("email").toString();
String p_id=request.getParameter("id");
int qn=1;
int pp=0;
int pt=0;
int ct=0;
String name=null;
 
int z=0;
try
{
	Connection con=Connect.getConnet();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from product_table where id='"+p_id+"'");
	while(rs.next())
	{
		name=rs.getString(2);
		pp=rs.getInt(4);
		pt=pp;
	}
	ResultSet rs1=st.executeQuery("select * from cart where product_id='"+p_id+"' and email='"+email+"' and address is NULL ");
	while(rs1.next())
	{
		ct=rs1.getInt(5);
		ct=ct+pt;
		qn=rs1.getInt(3);
		qn=qn+1;
		z=1;
	}
	if(z==1)
	{
		st.executeUpdate("update cart set total='"+ct+"',quantity='"+qn+"' where product_id='"+p_id+"' and email='"+email+"'");
		response.sendRedirect("home.jsp?msg=exist");
	}
	if(z==0)
	{
		PreparedStatement ps=con.prepareStatement("insert into cart(email,product_name,product_id,quantity,price,total)value(?,?,?,?,?,?)");
		ps.setString(1,email);
		ps.setString(2, name);
		ps.setString(3, p_id);
		ps.setInt(4, qn);
		ps.setInt(5,pp);
		ps.setInt(6, ct);
		ps.executeUpdate();
		response.sendRedirect("home.jsp?msg=added");
	}
}
catch(Exception e)
{
	out.print(e);
}
%>
</body>
</html>