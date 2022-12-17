package com.demo2.Vowels;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string to check vowels..");
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			{
				c++;	
			}
		}
		System.out.println("Number of vowels= "+c);

	}

}
