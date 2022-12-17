package com.demo3.OddEven;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a=scn.nextInt();
		System.out.println("Enter the valus");
		int ar[]=new int[a];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scn.nextInt();
		}
		System.out.println("odd numbers");
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]%2==1)
			{
				System.out.print(ar[j]+" ");
			}
		}
		System.out.println();
		System.out.println("Even numbers");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				System.out.print(ar[i]+" ");
			}
		}

	}

}
