package com.mr.chapter05;

public class Ex08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("1.添加--------------------");
		add();
		System.out.println("2.修改--------------------");
		update();
		System.out.println("3.删除--------------------");
		delete();
	}
	
	//添加
	public static void add()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("ABC");
		System.out.println("append添加结果;"+sb);
		sb.insert(3, "DE");
		System.out.println("INSERT添加结果"+ sb);
	}
	
	//修改
	public static void update()
	{
		StringBuffer sb = new StringBuffer("ABAAA");
		//修改指定位置字符
		sb.setCharAt(2, 'C');
		System.out.println("修改指定位置字符结果："+ sb);
		sb.replace(3, 5, "DE");
		System.out.println("替换指定位置字符结果："+ sb);
		System.out.println("字符串翻转结果:"+sb.reverse());
	}
	
	//删除
	public static void delete()
	{
		StringBuffer sb=new StringBuffer("ABCDEFG");
		sb.delete(3, 7);
		System.out.println("删除指定位置结果："+sb);
		sb.deleteCharAt(2);
		System.out.println("删除指定位置结果:"+sb);
		sb.delete(0, sb.length());//清空缓存
		System.out.println("清空缓冲区结果："+sb);
		
	}
}

