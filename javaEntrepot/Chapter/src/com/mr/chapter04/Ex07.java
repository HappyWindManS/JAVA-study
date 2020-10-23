package com.mr.chapter04;

public class Ex07 {

	//重写默认继承的obj类里的toString方法
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Ex07 e = new Ex07();
		Animal animal=e.new Animal();
		System.out.println(animal.toString());
	}
	
	class Animal{
		public String toString()
		{
			return "这是一只动物";
		}
	}
}
