package com.demo.StarPyramid;

import java.util.Scanner;

public class starPyramid {

	public static void main(String[] args) 
	{
		 Scanner scn=new Scanner(System.in);
         System.out.println("Enter the row");
         int a=scn.nextInt();
         for(int i=1;i<=a;i++)
         {
                for(int j=a;j>=i;j--)
                   {
                       System.out.print(" ");
                   }
                for(int k=1;k<=i;k++)
                   {
                         System.out.print("* ");
                   }
           System.out.println();
         }

	}

}
