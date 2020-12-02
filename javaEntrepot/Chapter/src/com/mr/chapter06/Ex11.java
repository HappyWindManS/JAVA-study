package com.mr.chapter06;

import java.util.TreeSet;

public class Ex11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(3);
		ts.add(9);
		ts.add(1);
		ts.add(21);
		
		System.out.println("创建的TreeSet集合为："+ts);
		//2.获取首尾元素
		System.out.println("TreeSet集合首元素为："+ts.first());
		System.out.println("TreeSet集合尾元素为："+ts.last());
		
		//比较并获取元素
		System.out.println("集合中小于或等于9的最大一个的元素为："+ts.floor(9));
		System.out.println("集合中大于10的最小的一个元素为："+ts.higher(10));
		System.out.println("集合中大于100的最小的一个元素为："+ts.higher(100));
		
		Object first =ts.pollFirst();
		System.out.println("删除的第一个元素为："+first);
		
	}

}
