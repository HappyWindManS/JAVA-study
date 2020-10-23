package com.mr.chapter03;

public class Ex04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person p = new Person();
		p.setName("张三");
		p.setAge(-18);
		p.speak();
	}
	
	static class Person
	{
		private String name;
		private int age;
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		
		public int getAge()
		{
			return age;
		}
		public void setAge(int age)
		{
			if(age < 0)
			{
				System.out.println("您输入的年龄不正确");
			}
			else
			{
				this.age = age;
			}
		}
		
		public void speak()
		{
			System.out.println("我叫"+name+",今年"+age+"岁了");
		}
	}
	
}
