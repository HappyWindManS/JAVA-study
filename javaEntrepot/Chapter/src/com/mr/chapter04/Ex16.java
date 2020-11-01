package com.mr.chapter04;
//定义接口Animal16
interface Animal16{
	void shout();//定义抽象shout（）方法
}
//定义Cat类实现Animal接口
class Cat16 implements Animal16{
	//实现接口shout（）方法
	public void shout() {
		System.out.println("喵喵......");
	}
	//定义Cat类特有的抓老鼠catchMouse()方法
	public void catchMouse() {
		System.out.println("小猫抓老鼠...");
	}
}
//定义测试类
public class Ex16 {
	public static void main(String[] agrs) {
		Animal16 an1 = new Cat16();
		Cat16 cat = (Cat16) an1;
		cat.shout();
		cat.catchMouse();
	}
}
