package com.mr.chapter04;
//����ӿ�Animal16
interface Animal16{
	void shout();//�������shout��������
}
//����Cat��ʵ��Animal�ӿ�
class Cat16 implements Animal16{
	//ʵ�ֽӿ�shout��������
	public void shout() {
		System.out.println("����......");
	}
	//����Cat�����е�ץ����catchMouse()����
	public void catchMouse() {
		System.out.println("Сèץ����...");
	}
}
//���������
public class Ex16 {
	public static void main(String[] agrs) {
		Animal16 an1 = new Cat16();
		Cat16 cat = (Cat16) an1;
		cat.shout();
		cat.catchMouse();
	}
}
