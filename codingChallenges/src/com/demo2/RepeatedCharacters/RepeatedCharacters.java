package com.demo2.RepeatedCharacters;

import java.util.Scanner;

public class RepeatedCharacters {

	public static void main(String[] args) 
	{
		System.out.println("Enter the String to check..");
		Scanner scn=new Scanner(System.in);
		String a=scn.nextLine();
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					System.out.print(a.charAt(j));
					break;
				}
			}
		}

	}

}
