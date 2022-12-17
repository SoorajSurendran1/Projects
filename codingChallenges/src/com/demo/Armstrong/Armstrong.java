package com.demo.Armstrong;

import java.util.Scanner;

public class Armstrong
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to check..");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=n;
		int r=0;
		int s;
		while(n!=0)
		{
			s=n%10;
			r+=s*s*s;
			n/=10;
		}
		
		if(r==a)
		{
			System.out.println("The number is Armstrong...");
		}
		else 
		{
			System.out.println("The number is not Armstrong....");
		}
	}
}

