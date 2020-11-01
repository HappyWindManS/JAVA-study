package com.mr.chapter04;
//定义接口Animal
interface Animal17{
	void shout();//定义shout（）方法
}
//定义cat类实现Animal接口
class Cat17 implements Animal17{
	//实现接口shout（）方法
	public void shout() {
		System.out.println("喵喵...");
	}
	//定义cat类特有的抓老鼠catchMouse（）方法
	public void catchMouse() {
		System.out.println("小猫抓老鼠...");
	}
}
//定义Dog类实现Animal接口
class Dog17 implements Animal17{
	//实现接口shout（）方法
	public void shout() {
		System.out.println("旺旺...");
	}
}
//定义测试类
public class Ex17 {
	public static void main(String[] args) {
		Animal17 an1 = new Dog17();
		if(an1 instanceof Cat17) {          //判断an1本质类型
			Cat17 cat = (Cat17) an1;
			cat.shout();
			cat.catchMouse();
		}else {
			System.out.println("该类型的对象不是Cat类型！");
		}
	}
}
