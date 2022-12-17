package com.demo3.SpecifiedIndex;

import java.util.Scanner;

public class SpecifiedIndex {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Size of Array");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int []arr=new int[a];
		int []arr1=new int[a+1];
		System.out.println("Enter the values");
		for(int i=0;i<a;i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println("Enter the index no to value add");
		int index=scn.nextInt();
		System.out.println("Enter the value to add");
		int c=scn.nextInt();
		for(int i=0;i<index;i++)
		{
			arr1[i]=arr[i];
		}
		arr1[index]=c;
		for(int i=index+1;i<=a;i++)
		{
			arr1[i]=arr[i-1];
		}
		for(int t=0;t<arr1.length;t++)
		{
			System.out.print(arr1[t]+" ");
		}

	}

}
