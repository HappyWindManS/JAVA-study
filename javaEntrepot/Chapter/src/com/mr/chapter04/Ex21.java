package com.mr.chapter04;
//���嶯����ӿ�
interface Animal21{
	void shout();
}
public class Ex21 {
	public static void main(String[] args) {
		String name = "С��";
		//���������ڲ�����Ϊ�������ݸ�animalshout��������
		animalShout(new Animal21(){
			//ʵ��shout��������
			public void shout() {
				//JDK 8 ��ʼ���ֲ��ڲ��ࡢ�����ڲ�����Է��ʷ�final�ľֲ�����
				System.out.println(name+"����...");
			}
		});
	}
	//���徲̬����animalShout(),���սӿ������
	public static void animalShout(Animal21 an) {
		an.shout();//���ô��˶���an��shout��������
	}
}
