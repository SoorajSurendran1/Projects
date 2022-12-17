package com.demo.NumberPyramid;

import java.util.Scanner;

public class NumberPyramid2 {

	public static void main(String[] args) 
	{
		 System.out.println("enter no");
         Scanner scn=new Scanner(System.in);
         int a=scn.nextInt();
         int k=0;
         for(int i=1;i<=a;i++)
            {
                   for(int j=1;j<=i;j++)
                      {
                	       k++;
                           System.out.print(k+" "); 
                      }
              System.out.println(" ");
            }

	}

}
