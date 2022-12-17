package com.demo2.RemoveWord;

import java.util.Scanner;

public class Remove
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string .. ");
		   Scanner scn= new Scanner(System.in);
		   String a= scn.nextLine();
		   System.out.println("Enter the word to remove");
		   String c=scn.next();
		   String b=a.replace(c, "");
		   System.out.println(b);
	}
}
