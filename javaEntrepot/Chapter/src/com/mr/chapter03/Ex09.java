package com.mr.chapter03;

public class Ex09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		People p = new People(18);
		p.speak();
	}

}

class People
{
	int age;
	public People(int age)
	{
		this.age=age;
	}
	
	//speak方法
	public void speak()
	{
		System.out.println("我今年"+age+"岁了！");
	}
}