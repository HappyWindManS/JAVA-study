package com.mr.chapter06;

import java.util.HashSet;

public class Ex09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet set = new HashSet();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		//lambda表达式
		set.forEach(obj -> System.out.println(obj));
	}

}
