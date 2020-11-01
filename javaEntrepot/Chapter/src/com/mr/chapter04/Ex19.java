package com.mr.chapter04;
//定义外部类Outer
class Outer19{
	int m = 0;
	void test1() {
		System.out.println("外部成员方法");
	}
	void test2() {
		//1.定义局部内部类Inner，在局部内部类中访问外部类变量和方法
		class Inner{
			int n = 1;
			void show() {
				System.out.println("外部类变量 m="+m);
				test1();
			}
		}
		//2.在创建局内部类的方法中，调用局部内部类变量和方法
		Inner inner = new Inner();
		System.out.println("局部内部类变量 n="+inner.n);
		inner.show();
	}
}
//定义测试类
public class Ex19 {
	public static void main(String[] args) {
		Outer19 outer = new Outer19();
		outer.test2();//通过外部类对象调用创建了局部每部类的方法
	}
}
