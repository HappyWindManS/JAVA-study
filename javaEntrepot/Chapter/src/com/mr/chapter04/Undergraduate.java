package com.mr.chapter04;

public class Undergraduate extends Student {
	
	private String degree;
	
	public void show()
	{
		System.out.printf("我叫%s,我几年%s了,我是%s专业的\n",getName(),getAge(),getDegree());
	}
	
	Undergraduate(String name,int age,String degree)
	{
		super(name,age);
		setDegree(degree);
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

}
