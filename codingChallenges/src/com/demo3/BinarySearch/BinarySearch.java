package com.demo3.BinarySearch;

import java.util.Scanner;

public class BinarySearch {

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
		System.out.println("Enter tht number to search");
		int n=scn.nextInt();
		for(int j=0;j<a;j++)
		{
			if(arr[j]==n)
			{
				System.out.println("index is "+j);
				break;
			}
		}

	}

}
