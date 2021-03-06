package com.mr.chapter06;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList list= new ArrayList();
		list.add("jack");
		list.add("annie");
		list.add("rose");
		list.add("tom");
		
		//当元素被删除后，迭代还在继续，迭代器运行的次数和元素不一致，就会产生报错
		/*
		 * 两种方法
		 * 1.当符合条件进行删除，且不关心之后的元素时，可用break跳出循环
		 * 2.使用迭代器本身的删除方法进行删除，则迭代器剩余运行次数可预知
		 * */
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if("annie".equals(obj))
			{
				//list.remove(obj);
				it.remove();
			}
		}
		System.out.println(list);
	}

}
