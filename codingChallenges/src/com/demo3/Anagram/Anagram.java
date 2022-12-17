package com.demo3.Anagram;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		int f=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String a=scn.next();
		System.out.println("Enter the 2nd string");
		String b=scn.next();
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				f=1;
				break;
			}
		
		}
		if(f==0)
		{
			System.out.println("It is a anagram");
		}
		else 
		{
			System.out.println("it is not a anagram");
			
		}
	}

}
