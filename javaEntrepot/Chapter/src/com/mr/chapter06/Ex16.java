package com.mr.chapter06;

import java.util.HashMap;
import java.util.Map;

public class Ex16 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map map = new HashMap();
		map.put("1", "Jcak");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println(map);
		map.forEach((k,v) -> System.out.println(k+":"+v));
	}
}
