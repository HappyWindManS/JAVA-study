package com.mr.chapter06;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Demo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeMap<String,String> map = new TreeMap<String,String>(new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {
				// TODO 自动生成的方法存根				
				return s2.compareTo(s1);
			}
			
		});
		map.put("3", "Smith");
		map.put("1", "Lucy");
		map.put("2", "John");
		map.put("4", "Aimee");
		map.put("5", "Amanda");
		System.out.println(map);
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			String temp = (String) it.next();
			System.out.println(temp+":"+map.get(temp));
		}
	}

}
