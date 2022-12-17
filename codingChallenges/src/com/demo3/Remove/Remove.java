package com.demo3.Remove;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args)
	{
		System.out.println("Enter the Size of Array");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int []arr=new int[a];
		int []arr1=new int[a-1];
		System.out.println("Enter the values");
		int k=0;
		for(int i=0;i<a;i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println("enter the value to remove");
		int c=scn.nextInt();
		for(int i=0;i<a;i++)
		{
			if(arr[i]!=c)
			{
				arr1[k]=arr[i];
				k++;
			}
		 }
		System.out.println("After removing");
		for(int i=0;i<a-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}

	}

}
