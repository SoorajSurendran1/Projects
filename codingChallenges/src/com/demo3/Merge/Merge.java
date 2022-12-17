package com.demo3.Merge;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args)
	{
		System.out.println("Enter the Size of first array");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int [] arr1=new int[a];
		System.out.println("Enter the first Array values..");
		for(int i=0;i<a;i++)
		{
			arr1[i]=scn.nextInt();
		}
		System.out.println("Enter the Size of second array..");
		int b=scn.nextInt();
		int [] arr2=new int[b];
		System.out.println("Enter the first Array values..");
		for(int i=0;i<b;i++)
		{
			arr2[i]=scn.nextInt();
		}
		int c=a+b;
		int arr3[]=new int[c];
		for(int i=0;i<a;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int i=0;i<b;i++)
		{
			arr3[a+i]=arr2[i];
		}
		System.out.println("Merged Array");
		for(int i=0;i<c;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		

	}

}
