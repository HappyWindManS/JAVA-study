package com.mr.chapter04;
//定义外部类Outer
class Outer20{
	static int m = 0;//定义外部类静态变量m
	static class Inner{
		void show() {
			//静态内部类访问外部类静态成员
			System.out.println("外部类静态变量 m="+m);
		}
	}
}
//定义测试类
public class Ex20 {
	public static void main(String[] args) {
		//静态内部类可以直接通过外部类创建
		Outer20.Inner inner = new Outer20.Inner();
		inner.show();
	}
}
