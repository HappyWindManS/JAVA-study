package com.mr.chapter06;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList list = new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		
		System.out.println(list);
		//将集合转换为Iterator迭代器对象
		Iterator it = list.iterator();
		//使用自带的foreachRemaining方法来遍历迭代器对象
		it.forEachRemaining(obj -> System.out.println("迭代集合元素："+obj));
	}

}
