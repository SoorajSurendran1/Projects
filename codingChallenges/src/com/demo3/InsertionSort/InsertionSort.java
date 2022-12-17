package com.demo3.InsertionSort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter the values");
		for(int i=0;i<a;i++)
		{
			
			arr[i]=scn.nextInt();
			
		}
		for(int j=1;j<a;j++)
		{
			int c=arr[j];
			int i=j-1;
			
			while((i>-1)&&(arr[i]>c))
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=c;
		}
		System.out.println("Sorted array ");
		for(int i=0;i<a;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
