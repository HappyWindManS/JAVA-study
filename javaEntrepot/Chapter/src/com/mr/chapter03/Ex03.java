package com.mr.chapter03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person p = new Person();
		p.name = "张三";
		p.age = -18;
		p.speak();
	}

	static class Person
	{
		String name;
		int age;
		public void speak()
		{
			System.out.println("我叫"+name+",今年"+age+"岁了");
		}
	}
}
