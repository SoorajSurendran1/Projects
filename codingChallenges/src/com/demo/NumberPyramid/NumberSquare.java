package com.demo.NumberPyramid;

import java.util.Scanner;

public class NumberSquare {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter the row no");
        int a=scn.nextInt();
        int b=a;
        for(int i=1;i<=b;i++)
          {
        	for(int j=1;j<=b;j++) 
            {
                System.out.print(a+" ");
            }
        	a--;
        	 System.out.println();
          }

	}

}
