package com.demo3.LargetSmallest;

import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args)
	{
		System.out.println("Enter the no of array");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=1;
		int arr[]=new int [a];
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter "+b+" number");
			arr[i]=scn.nextInt();
			b++;
		}
		for(int i=0;i<a;i++)
		{
			int index=i;
			for(int j=i+1;j<a;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			int sm=arr[index];
			arr[index]=arr[i];
			arr[i]=sm;
		}
		
		System.out.println("Second Smallest number is ="+arr[1]);
		for(int i=0;i<a;i++)
		{
			int index=i;
			for(int j=i+1;j<a;j++)
			{
				if(arr[j]>arr[index])
				{
					index=j;
				}
			}
			int bg=arr[index];
			arr[index]=arr[i];
			arr[i]=bg;
		}
		System.out.println("Third Largest number is ="+arr[2]);
	}

}
