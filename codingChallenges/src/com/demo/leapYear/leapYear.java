package com.demo.leapYear;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args)
	{
		System.out.println("Enter the year to find");
		Scanner scn=new Scanner(System.in);
		int y=scn.nextInt();
		int f=0;
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					f++;
				}
			}
			else
			{
				f++;
			}
		}
		
		if(f>0)
		{
			System.out.println(y+" it is a Leap year");
		}
		else
		{
			System.out.println(y+" not a Leap year");
		}

	}

}
