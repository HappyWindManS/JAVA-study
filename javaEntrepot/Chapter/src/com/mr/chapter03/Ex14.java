package com.mr.chapter03;

public class Ex14 {

	static {
		System.out.println("主类里的静态代码块");
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Ex14();
		new Person1();
	}
}

class Person1
{
	static{
		System.out.println("Person的静态代码块");
	}
}