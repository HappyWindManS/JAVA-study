package com.mr.chapter03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Person p = new Person();
		p.name = "����";
		p.age = -18;
		p.speak();
	}

	static class Person
	{
		String name;
		int age;
		public void speak()
		{
			System.out.println("�ҽ�"+name+",����"+age+"����");
		}
	}
}
