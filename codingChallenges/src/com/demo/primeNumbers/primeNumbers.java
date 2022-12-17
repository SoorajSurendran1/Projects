package com.demo.primeNumbers;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number limit..");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int x=0;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					x++;
					break;
				}
			}
			if(x==0 && i!=1)
			{
				System.out.print(i+" ");
			}
		}

	}

}
