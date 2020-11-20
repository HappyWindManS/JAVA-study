package com.mr.chapter06;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList list = new ArrayList();
		//向该集合中添加字符串
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		//获取Iterator对象
		Iterator iterator = list.iterator();
		
				//调用hasNext()方法判断是否还有元素
		
		while(iterator.hasNext())
		{
			Object obj = iterator.next();
			System.out.println(obj);
		}
	}

}
