package com.mr.chapter04;
//���嶯����ӿ�
interface Animal22{
	void shout();//����shout��������
}
public class Ex22 {
	public static void main(String[] args) {
		String name = "С��";
		//1.�����ڲ�����Ϊ�������ݸ�animalShout��������
		animalShout(new Animal22() {
			public void shout() {
				System.out.println("�����ڲ��������"+name+"����...");
			}
		});
		//2.ʹ��Lambda����ʽ��Ϊ�������ݸ�animalShout��������
		animalShout(()->System.out.println("Lambda����ʽ���:"+name+"����..."));
	}
	//����һ��animalShout������̬���������սӿ����͵Ĳ���
	public static void animalShout(Animal22 an) {
		an.shout();
	}
}