package com.mr.chapter06;

import java.util.HashSet;

public class Ex09 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		HashSet set = new HashSet();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		//lambda���ʽ
		set.forEach(obj -> System.out.println(obj));
	}

}
