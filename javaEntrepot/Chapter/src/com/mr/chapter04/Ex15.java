package com.mr.chapter04;
//���������Animal
abstract class Animal15{
	abstract void shout();//�������shout��������
}
//����cat��̳�Animal������
class Cat15 extends Animal15{
	//ʵ��shout��������
	public void shout() {
		System.out.println("����......");
	}
}
//����Dog��̳�Animal������
class Dog15 extends Animal15{
	public void shout() {
		System.out.println("����......");
	}
}
//���������
public class Ex15 {
	public static void main(String[] args) {
		Animal15 an1 = new Cat15();
		Animal15 an2 = new Dog15();
		an1.shout();
		an2.shout();
	}
}
