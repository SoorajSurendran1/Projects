package com.demo.DiamondPattern;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter the row");
        int a=scn.nextInt();
        int b=a-1;
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
        for(int m=1;m<=b;m++)
           {
                 for(int n=1;n<=m+1;n++)
                    {
                          System.out.print(" ");

                    }
                 for(int x=b;x>=m;x--)
                    {
                          System.out.print("* ");
                    } 
             System.out.println();
          }

	}

}
