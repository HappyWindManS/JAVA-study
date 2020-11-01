package com.mr.chapter04;
//定义动物类接口
interface Animal21{
	void shout();
}
public class Ex21 {
	public static void main(String[] args) {
		String name = "小花";
		//定义匿名内部类作为参数传递给animalshout（）方法
		animalShout(new Animal21(){
			//实现shout（）方法
			public void shout() {
				//JDK 8 开始，局部内部类、匿名内部类可以访问非final的局部变量
				System.out.println(name+"喵喵...");
			}
		});
	}
	//定义静态方法animalShout(),接收接口类参数
	public static void animalShout(Animal21 an) {
		an.shout();//调用传人对象an的shout（）方法
	}
}
