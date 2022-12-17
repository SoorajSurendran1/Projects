package com.demo2.Uppercase;

import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) 
	{
		System.out.println("Enter the String to convert to upper case");
		Scanner scn=new Scanner(System.in);
		String st=scn.nextLine();
		for(int i=0;i<st.length();i++)
		{
			char a=st.charAt(i);
			char b=(char) (a-32);
			System.out.print(b+"");
			
		}
		//to lower case
		for(int v=0;v<st.length();v++)
		{
			char a=st.charAt(v);
			char b=(char) (a+32);
			System.out.print(b+"");
			
		}
		
	}

}
