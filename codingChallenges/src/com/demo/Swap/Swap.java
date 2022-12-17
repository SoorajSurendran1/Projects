package com.demo.Swap;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args)
	{
		System.out.println("Enter two number to swap..");
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		System.out.println("Enter second number..");
		int n2=scn.nextInt();
		System.out.println("Befor Swapping "+n1+" "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping "+n1+" "+n2);
		
	}

}
