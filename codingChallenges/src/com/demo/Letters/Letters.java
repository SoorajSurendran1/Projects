package com.demo.Letters;

import java.util.Scanner;

public class Letters {

	public static void main(String[] args) 
	{
		 Scanner scn=new Scanner(System.in);
         System.out.println("Enter the Row for print Alphbets");
         int a=scn.nextInt();
         char c='a';
         char d=c;
         for(int i=1;i<=a;i++)
            {
                  for(int j=1;j<=i;j++)
                      {
                         System.out.print(" ");
                      }
                  for(int k=a;k>=i;k--)
                      {
                        System.out.print(c+" ");
                        c++;
                      }
               c=d;
               System.out.println();
               
            }           

	}

}
