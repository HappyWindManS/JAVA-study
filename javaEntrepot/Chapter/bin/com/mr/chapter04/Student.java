package com.mr.chapter04;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void show()
	{
		System.out.print("我叫："+name+"，我今年"+age+"岁了");
	}
}

