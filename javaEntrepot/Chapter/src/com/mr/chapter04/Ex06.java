package com.mr.chapter04;

public class Ex06 {

	//ToString�󽫻᷵�����¸�ʽ�Ĵ���
	/*
	 * getClass().getName()+"@"+Integer.toHexString(hashCode())
	 * getClass().getName ���᷵�ذ��������������
	 * ��Ϊ com.mr.chapter04.Ex06
	 **************************************
	 * hashCode() �����ظö���Ĺ�ϣֵ
	 * Integer.toHexString(hashCode())��������Ĺ�ϣֵ��ʮ�����Ʊ�ʾ
	 * ��Դ�ڿ���112ҳ
	 * */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Ex06 e =new Ex06();
		Animal animal = e.new Animal();
		System.out.println(animal.toString());
	}

	class Animal
	{
		void shout()
		{
			System.out.println("�����");
		}
	}
}
