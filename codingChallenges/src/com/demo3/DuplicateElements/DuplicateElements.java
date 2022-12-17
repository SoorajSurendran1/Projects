package com.demo3.DuplicateElements;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Size of Array");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int arr[]= new int[a];
		System.out.println("Enter the values");
		for(int i=0;i<a;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int k=0;k<a;k++)
		{
			for(int j=k+1;j<a;j++)
			{
				if(arr[k]==arr[j])
				{
				     arr[j]=0;
				}
			
		     }
		}
		System.out.println("Remove Duplicate Elements");
		for(int i=0;i<a;i++)
		{
			System.out.print(arr[i]+" " );
		}   
		}

}
