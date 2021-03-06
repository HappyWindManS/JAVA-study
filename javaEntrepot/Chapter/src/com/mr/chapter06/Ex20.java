package com.mr.chapter06;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Ex20 {
	
	public static void main(String[] args)
	{
		Map map = new TreeMap(new MyComparator1());
		map.put("2", "Rose");
		map.put("1", "Jack");
		map.put("3", "Lucy");
		System.out.println(map);
	}
}

class MyComparator1 implements Comparator{
	public int compare(Object o1,Object o2)
	{
		String key1 = (String)o1;
		String key2 = (String)o2;
		return key2.compareTo(key1);
	}
}
