package com.demo.StarDown;

import java.util.Scanner;

public class Down {

	public static void main(String[] args) 
	{
		 Scanner scn=new Scanner(System.in);
         System.out.print("Enter the row");
         int a=scn.nextInt();
         int b=a;
         for(int i=1;i<=a;i++)
            {
                for(int j=1;j<=i;j++)
                   {
                      System.out.print(" ");
                   }
                for(int k=b;k>=i;k--)
                   {
                      System.out.print("* ");
                   }
              System.out.println();
            }

	}

}
