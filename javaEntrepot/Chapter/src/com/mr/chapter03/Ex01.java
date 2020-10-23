package com.mr.chapter03;

public class Ex01 {
    public static int age;
   	static void speak()
	{
		System.out.println("我今年"+age+"岁了");
	}
	
	public static void main(String[] args)
	{
		age=18;
		speak();
	}
}
