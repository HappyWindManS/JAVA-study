package com.mr.chapter04;

public class Ex09 {

		// final即  最终
		/*
		 * 在此修饰符下
		 * 
		 * 不能被继承
		 * 不能被重写
		 * 不能被赋值
		 * */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	class Animal
	{
		//使用final修饰shout()方法
		public final void shout()
		{
		}
	}
	
	
	class Dog extends Animal
	{
		/*
		public void shout()
		{
			
		}
		*/
	}
}
