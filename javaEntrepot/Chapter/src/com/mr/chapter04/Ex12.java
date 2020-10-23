package com.mr.chapter04;

public class Ex12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Ex12 e = new Ex12();
		Dog dog=e.new Dog();
		dog.shout();
	}
	
	abstract class Animal
	{
		public abstract void shout();
	}
	
	class Dog extends Animal
	{
		public void shout()
		{
			System.out.println("汪汪汪......");
		}
	}
}
