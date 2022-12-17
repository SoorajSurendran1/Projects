package com.demo2.PrintReverse;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string to Reverse.. ");
		   Scanner scn= new Scanner(System.in);
		   String a= scn.nextLine();
		   String[] b=a.split(" ");
		   int c=b.length;
		   for(int i=0;i<b.length;i++)
		   {
			   c--;
			   System.out.print(b[c]+" ");
			   
		   }

	}

}
