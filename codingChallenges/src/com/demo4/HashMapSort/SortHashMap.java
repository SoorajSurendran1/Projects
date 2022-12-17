package com.demo4.HashMapSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class SortHashMap {

	public static void main(String[] args) 
	{
		HashMap<Object, Object>hm=new HashMap<>();
		hm.put(143, "apple");
		hm.put(24, "mango");
		hm.put(3, "orange");
		//System.out.println(hm);
		int i=0;
		
		Object ar[]=new Object[hm.size()];
		Iterator<Object>itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			ar[i]=itr.next();
			i++;
		}
		
		
		Arrays.sort(ar);
		
		
		System.out.println("Sort HashMap by keys ");
		
		for(int j=0;j<ar.length;j++)
		{
			System.out.print("["+ar[j]+"="+hm.get(ar[j])+"] ");
		}

	}

}
