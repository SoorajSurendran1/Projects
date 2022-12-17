package com.demo4.HashSet1;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList<>();
		HashSet<String>hs=new HashSet<>();
		hs.add("hello");
		hs.add("star");
		hs.add("tiger");
		hs.add("numbers");
		al.addAll(hs);
		System.out.println(al);
		System.out.println(hs);
		System.out.println(al.get(0));

	}

}
