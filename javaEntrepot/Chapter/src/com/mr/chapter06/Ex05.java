package com.mr.chapter06;

public class Ex05 {
	
	static String[] array = {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//1.foreach循环遍历数组
		for(String str:array)
		{
			str = "ddd";
		}
		System.out.println("foreach修改过后的数组："+array[0]+","+array[1]+","+array[2]);
		
		//2.for循环遍历数组
		for(int i=0;i<array.length;i++)
		{
			array[i] = "ddd";
		}
		System.out.println("for循环修改过后的数组："+array[0]+","+array[1]+","+array[2]);
	}

}
