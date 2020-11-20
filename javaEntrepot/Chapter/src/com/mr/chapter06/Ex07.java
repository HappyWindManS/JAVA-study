package com.mr.chapter06;

import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList list = new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		
		//使用foreach方法遍历集合
		list.forEach(obj->System.out.println("迭代集合元素："+obj));
	}

}
