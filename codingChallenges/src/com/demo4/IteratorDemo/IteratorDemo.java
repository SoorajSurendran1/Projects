package com.demo4.IteratorDemo;


import java.util.Iterator;
import java.util.TreeMap;

public class IteratorDemo
{

	public static void main(String[] args) 
	{
		TreeMap<Object, Object>tm=new TreeMap<>();
		tm.put(1, "java");
		tm.put(2, "php");
		tm.put(3, 32);
		//System.out.println(tm);
		Iterator<Object>tr =tm.keySet().iterator();
		while(tr.hasNext())
		{
			Object st=tr.next();
			Object vl=tm.get(st);
			System.out.print("["+st+"="+vl+"]"+",");
		}

	}

}
