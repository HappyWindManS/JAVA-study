package com.mr.chapter06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Ex17 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map map = new HashMap();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println(map);
		Collection values = map.values();
		values.forEach(v -> System.out.println(v));
	}
}
