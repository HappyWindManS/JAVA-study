package com.mr.chapter05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str = "2018-01-24";
		//字符串截取
		System.out.println("从第6个字符截取到末尾的结果："+str.substring(5));
		System.out.println("从第6个字符截取到第7个字符的结果："+str.substring(5,7));
		//字符串分割
		System.out.print("分割后的字符串数组中的元素依次为：");
		
		String[] strArray = str.split("-");
		
		for(String text:strArray)
		{
			System.out.print(text+"/");
		}
		System.out.printf("\b");
	}

}
