package com.mr.chapter04;

public class Undergraduate extends Student{
	
	private String degree; 
	
	Undergraduate(String name,int age,String degree)
	{
		super(name,age);
		this.degree = degree;
	}

	public void show()
	{
		System.out.println("我叫"+getName()+",我的年龄是"+getAge()+"岁，我的专业是"+getDegree());
	}
	
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
}
