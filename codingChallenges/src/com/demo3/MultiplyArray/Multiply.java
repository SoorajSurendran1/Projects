package com.demo3.MultiplyArray;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) 
	{
		System.out.println("Enter the row for first array");
		Scanner scn =new Scanner(System.in);
		int r1=scn.nextInt();
		System.out.println("Enter the colum for first array");
		int c1=scn.nextInt();
		int arr1[][]=new int[r1][c1];
		System.out.println("Enter the first array values");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr1[i][j]=scn.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter the row for second array");
		int r2=scn.nextInt();
		System.out.println("Enter the colum for second array");
		int c2=scn.nextInt();
		int arr2[][]=new int[r2][c2];
		System.out.println("Enter the second array values");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				arr2[i][j]=scn.nextInt();
			}
			System.out.println();
		}
		int sum[][]=new int[r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<r2;k++)
				{
					sum[i][j]+=arr1[i][j]*arr2[k][j];
				}
			}
		}
		System.out.println("Multiply array");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

}
