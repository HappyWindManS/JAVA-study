package com.mr.chapter03;

public class Ex02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Person p1 = new Person();
		Person p2 = new Person();
		p1.age= 18;
		p1.speak();
		p2.speak();
	}
	
	public static class Person
	{
		int age;
		void speak()
		{
			System.out.println("�ҽ���"+age+"����");
		}
	}

}
