package com.mr.chapter04;
//定义动物类接口
interface Animal22{
	void shout();//定义shout（）方法
}
public class Ex22 {
	public static void main(String[] args) {
		String name = "小花";
		//1.匿名内部类作为参数传递给animalShout（）方法
		animalShout(new Animal22() {
			public void shout() {
				System.out.println("匿名内部类输出："+name+"喵喵...");
			}
		});
		//2.使用Lambda表达式作为参数传递给animalShout（）方法
		animalShout(()->System.out.println("Lambda表达式输出:"+name+"喵喵..."));
	}
	//创建一个animalShout（）静态方法，接收接口类型的参数
	public static void animalShout(Animal22 an) {
		an.shout();
	}
}
