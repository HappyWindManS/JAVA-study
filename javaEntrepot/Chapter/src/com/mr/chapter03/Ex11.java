package com.mr.chapter03;

public class Ex11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Person(18);
	}
	
	static class Person
	{
		public Person()
		{
			System.out.println("�޲ι��췽��");
		}
		public Person(int age)
		{
			this();
			System.out.println("�вι��췽��");
		}
	}
}
