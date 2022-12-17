package com.demo.StarDown;

import java.util.Scanner;

public class HollowRectangle {

	public static void main(String[] args) 
	{
		 Scanner scn=new Scanner(System.in);
         System.out.println("Enter row");
         int a=scn.nextInt();
         for(int i=1;i<=a;i++)
            {
                 for(int j=1;j<=a;j++)
                    {
                         if(i==1||i==a||j==1||j==a)
                           {
                                System.out.print(" *");
                           }
                        else
                           {
                                System.out.print("  ");
                           }
                    }
                  System.out.println("  ");
            }
	}

}
