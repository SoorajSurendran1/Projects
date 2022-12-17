package com.demo.Palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("Enter number to check..");
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int z=a;
        int r=0;
        int b=a;
        while(a!=0)
             {
                int i=a%10;
                r=r*10+i;
                a/=10;
             }
         if(r==b)
           {
                System.out.println(z+" Digit is Palindrome");
           }
        else
           {
                System.out.println(z+" Not a Palindrome");
           }

	}

}
