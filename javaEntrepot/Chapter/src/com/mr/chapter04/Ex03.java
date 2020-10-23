package com.mr.chapter04;

public class Ex03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Ex03 e = new Ex03();
		Dog dog=e.new Dog();
		dog.shout();
		dog.printName();
	}
	
	class Animal
	{
		String name="动物";
		
		//定义父类方法
		void shout()
		{
			System.out.println("动物发出叫声");
		}
	}
	
	class Dog extends Animal
	{
		//重写父类变量
		String name="犬类";
		//访问父类方法
		void shout()
		{
			super.shout();
		}
		void printName()
		{
			//调用父类变量
			System.out.println("name="+super.name);
			//子类变量不变
			System.out.println("name="+name);
		}
	}

}
