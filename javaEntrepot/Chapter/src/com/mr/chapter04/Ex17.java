package com.mr.chapter04;
//����ӿ�Animal
interface Animal17{
	void shout();//����shout��������
}
//����cat��ʵ��Animal�ӿ�
class Cat17 implements Animal17{
	//ʵ�ֽӿ�shout��������
	public void shout() {
		System.out.println("����...");
	}
	//����cat�����е�ץ����catchMouse��������
	public void catchMouse() {
		System.out.println("Сèץ����...");
	}
}
//����Dog��ʵ��Animal�ӿ�
class Dog17 implements Animal17{
	//ʵ�ֽӿ�shout��������
	public void shout() {
		System.out.println("����...");
	}
}
//���������
public class Ex17 {
	public static void main(String[] args) {
		Animal17 an1 = new Dog17();
		if(an1 instanceof Cat17) {          //�ж�an1��������
			Cat17 cat = (Cat17) an1;
			cat.shout();
			cat.catchMouse();
		}else {
			System.out.println("�����͵Ķ�����Cat���ͣ�");
		}
	}
}
