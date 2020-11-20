package com.mr.chapter06;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList list = new ArrayList();
		
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		//使用foreach循环遍历集合
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}

}
