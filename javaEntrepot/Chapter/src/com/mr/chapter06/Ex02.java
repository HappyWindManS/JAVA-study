package com.mr.chapter06;

import java.util.LinkedList;

public class Ex02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		LinkedList link = new LinkedList();
		
		link.add("stu1");
		link.add("stu2");
		System.out.println(link);	
		link.offer("offer");
		link.push("push");
		
		System.out.println(link);
		
		//��ȡԪ��
		Object object = link.peek();
		System.out.println(object);
		
		link.removeFirst();
		link.pollLast();
		System.out.println(link);
	}

}
