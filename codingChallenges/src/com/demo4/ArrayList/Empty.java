package com.demo4.ArrayList;

import java.util.ArrayList;

public class Empty {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList<>();
		//a1.add("hello");
		boolean a=a1.isEmpty();
		if(a==true)
		{
			System.out.println("ArrayList Is Empty");
		}
		else
		{
			System.out.println("ArrayList Is Not Empty");
		}

	}

}
