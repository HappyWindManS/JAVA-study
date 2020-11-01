package com.mr.chapter04;

public class Student {
	
	Student(String name,int age)
	{
		setName(name);
		setAge(age);
	}
	
	void show()
	{
		System.out.println("我叫"+getName()+",我今年"+getAge()+"岁了");
	}
	
    private	String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
