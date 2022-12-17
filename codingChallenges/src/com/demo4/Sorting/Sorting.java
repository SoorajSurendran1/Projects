package com.demo4.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Sorting {

	public static void main(String[] args) 
	{
		ArrayList<Object>arr=new ArrayList<>();
		arr.add("vv");
		arr.add("ff");
		arr.add("y");
		arr.add("aaa");
		int i=0;
		int a=arr.size();
		Object[] arr1=new Object[a];
		Iterator<Object>itr=arr.iterator();
		while(itr.hasNext())
		{
			arr1[i]=itr.next();
			i++;
		}
		System.out.println("Sort ArrayList with Comparable");
		Arrays.sort(arr1);
		for(int j=0;j<arr1.length;j++)
		{
			System.out.print(arr1[j]+",");
		}
		
		System.out.println();
		System.out.println("Sort ArrayList with Comparator");
		Arrays.sort(arr1,new ArrLength());
		for(int j=0;j<arr1.length;j++)
		{
			System.out.print(arr1[j]+",");
		}

	}

}
