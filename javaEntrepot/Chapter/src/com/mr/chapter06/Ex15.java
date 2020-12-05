package com.mr.chapter06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map map = new HashMap();
		map.put("1","Jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		System.out.println(map);
		Set keyset = map.keySet();
		Iterator it = keyset.iterator();
		while(it.hasNext())
		{
			Object key = it.next();
			Object value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
