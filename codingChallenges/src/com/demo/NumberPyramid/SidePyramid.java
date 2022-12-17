package com.demo.NumberPyramid;

import java.util.Scanner;

public class SidePyramid {

	public static void main(String[] args) 
	{
		   Scanner scn=new Scanner(System.in);
           System.out.println("Enter the row no");
           int a=scn.nextInt();
           int d=1;
           for(int i=1;i<=a;i++)
             {
                    for(int j=1;j<=i;j++) 
                       {
                           System.out.print(d+" ");
                           d++;
                       }
                
                 System.out.println();
              }

	}

}
