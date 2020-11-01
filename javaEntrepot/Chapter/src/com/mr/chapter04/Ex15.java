package com.mr.chapter04;
//定义抽象类Animal
abstract class Animal15{
	abstract void shout();//定义抽象shout（）方法
}
//定义cat类继承Animal抽象类
class Cat15 extends Animal15{
	//实现shout（）方法
	public void shout() {
		System.out.println("喵喵......");
	}
}
//定义Dog类继承Animal抽象类
class Dog15 extends Animal15{
	public void shout() {
		System.out.println("旺旺......");
	}
}
//定义测试类
public class Ex15 {
	public static void main(String[] args) {
		Animal15 an1 = new Cat15();
		Animal15 an2 = new Dog15();
		an1.shout();
		an2.shout();
	}
}
