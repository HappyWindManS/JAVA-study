package com.mr.chapter04;

public class Ex07 {

	//��дĬ�ϼ̳е�obj�����toString����
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Ex07 e = new Ex07();
		Animal animal=e.new Animal();
		System.out.println(animal.toString());
	}
	
	class Animal{
		public String toString()
		{
			return "����һֻ����";
		}
	}
}
