package com.mr.chapter04;

//������δ�����޲ι��췽��ʱ�����಻�������޲ι��췽��
//������ֻ����һ���вι��췽��ʱ������Ӧ�ڱ����췽����һ��ʹ��super(num1,num2...)���ø���Ĺ��췽��
public class Ex05 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Ex05 e = new Ex05();
		e.new Dog();
	}
	
	class Animal
	{
		public Animal()
		{
			System.out.println("����һֻ����");
		}
		public Animal(String name)
		{
			System.out.println("����һֻ"+name);
		}
		
	}

	class Dog extends Animal
	{
		public Dog()
		{
			super("�ϻ�");
		}
	}
}
