package com.demo2.AlphaNumeric;

import java.util.Scanner;

public class AlphaNumeric {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		String s=scn.next();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c >='0'&& c <= '9')
			{
				t+=c;
			}
			else {
				continue;
			}
		}
		System.out.println("number is "+t);

	}

}
