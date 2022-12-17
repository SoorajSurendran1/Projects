package com.demo.Reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
		 System.out.println("Enter a Digit");
         Scanner scn=new Scanner(System.in);
         int a=scn.nextInt();
         int r=0;
         while(a!=0)
              {
                     int i= a%10;
                     r=r*10+i;
                     a/=10;
              }
         System.out.println("Reverse No "+r);
	}

}
