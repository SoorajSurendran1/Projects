package com.demo2.RemoveWord;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		for(int i=1;i<s.length()-1;i++)
		{
			System.out.print(s.charAt(i));
		}

	}

}
