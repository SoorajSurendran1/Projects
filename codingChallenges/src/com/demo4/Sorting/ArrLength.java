package com.demo4.Sorting;

import java.util.Comparator;

public class ArrLength implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((String)o1).length()-((String)o2).length();
	}

}
