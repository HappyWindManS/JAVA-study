package com.mr.chapter03;

public class Ex11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Person(18);
	}
	
	static class Person
	{
		public Person()
		{
			System.out.println("无参构造方法");
		}
		public Person(int age)
		{
			this();
			System.out.println("有参构造方法");
		}
	}
}
