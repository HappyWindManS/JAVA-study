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
		System.out.println("�ҽ�"+getName()+",�ҵ�������"+getAge()+"�꣬�ҵ�רҵ��"+getDegree());
	}
	
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
}
