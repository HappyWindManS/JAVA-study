package com.mr.chapter06;

import java.util.HashMap;
import java.util.Map;

public class Ex14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map map = new HashMap();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		map.put("4", "Lucy");
		map.put("1", "Tom");
		System.out.println(map);
		
		System.out.println(map.containsKey("1"));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		map.replace("1", "Tom2");
		System.out.println(map);
		
		map.remove("1");
		System.out.println(map);
	}

}
