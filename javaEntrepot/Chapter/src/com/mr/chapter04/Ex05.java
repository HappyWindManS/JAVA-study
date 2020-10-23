package com.mr.chapter04;

//当父类未定义无参构造方法时，子类不能声明无参构造方法
//当父类只定义一个有参构造方法时，子类应在本身构造方法第一行使用super(num1,num2...)调用父类的构造方法
public class Ex05 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Ex05 e = new Ex05();
		e.new Dog();
	}
	
	class Animal
	{
		public Animal()
		{
			System.out.println("我是一只动物");
		}
		public Animal(String name)
		{
			System.out.println("我是一只"+name);
		}
		
	}

	class Dog extends Animal
	{
		public Dog()
		{
			super("老虎");
		}
	}
}
