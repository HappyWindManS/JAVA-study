package com.mr.chapter04;

public class Ex06 {

	//ToString后将会返回以下格式的代码
	/*
	 * getClass().getName()+"@"+Integer.toHexString(hashCode())
	 * getClass().getName 将会返回包名与类名的组合
	 * 即为 com.mr.chapter04.Ex06
	 **************************************
	 * hashCode() 代表返回该对象的哈希值
	 * Integer.toHexString(hashCode())代表将对象的哈希值用十六进制表示
	 * 来源于课文112页
	 * */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Ex06 e =new Ex06();
		Animal animal = e.new Animal();
		System.out.println(animal.toString());
	}

	class Animal
	{
		void shout()
		{
			System.out.println("动物叫");
		}
	}
}
