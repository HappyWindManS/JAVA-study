package com.mr.chapter06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex18 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Map map1 = new HashMap();
		map1.put("2", "Rose");
		map1.put("1", "Jack");
		map1.put("3", "Lucy");
		map1.forEach((k,v)-> System.out.println(k+":"+v));
		System.out.println("======================================");
		Map map2 = new LinkedHashMap();
		map2.put("2", "Rose");
		map2.put("1", "Jack");
		map2.put("3", "Lucy");
		map2.forEach((k,v)-> System.out.println(k+":"+v));
	}

}
