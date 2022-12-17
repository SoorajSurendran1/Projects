package com.demo.Average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
        int b=1;
        int w=5;
        Scanner scn=new Scanner(System.in);
        for(int i=1;i<=5;i++)
          {
           System.out.println("Enter a "+i+" Number");
           int a=scn.nextInt();
           b+=a;
          }
        int sum=b/w;
        System.out.println("Avg ="+sum);
	}

}
