package com.all.connecting;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect 
{
	public static Connection getConnet()
	{
		Connection con=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/poduct";
			con=DriverManager.getConnection(url,"root", "Sooraj@shilpa1");
			
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}
