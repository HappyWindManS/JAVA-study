package com.mr.chapter04;

public class Ex13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Ex13 e = new Ex13();
		Dog dog=e.new Dog();
		System.out.println(Animal.getID());
		System.out.println(dog.ID);
		dog.breathe();
		dog.getType("犬科");
	}
	
	interface Animal
	{
		int ID=1;
		void breathe();
		
		default void getType(String type)
		{
			System.out.println("该动物属于："+type);
		}
		
		static int getID()
		{
			return Animal.ID;
		}
	}
	
	class Dog implements Animal
	{
		public void breathe()
		{
			System.out.println("狗在呼吸");
		}
	}
}
