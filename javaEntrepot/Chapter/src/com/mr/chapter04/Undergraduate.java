package com.mr.chapter04;

public class Undergraduate extends Student {
	
	private String degree;
	
	public void show()
	{
		System.out.printf("�ҽ�%s,�Ҽ���%s��,����%sרҵ��\n",getName(),getAge(),getDegree());
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
