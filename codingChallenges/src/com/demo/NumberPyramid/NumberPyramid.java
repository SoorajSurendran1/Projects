package com.demo.NumberPyramid;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter the row");
        int a=scn.nextInt();
        int b=a;
        for(int i=1;i<=a;i++)
        {
               for(int j=a;j>=i;j--)
                  {
                      System.out.print(" ");
                  }
               for(int k=1;k<=i;k++)
                  {
                        System.out.print(b+" ");
                  }
           b--;
          System.out.println();
        }

	}

}
