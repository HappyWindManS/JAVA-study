package com.mr.chapter04;

//������Animal�ӿ�
interface Animal14{
	int ID = 1;     //����ȫ�ֳ���
	void breathe(); //������󷽷�breathe
	//����һ��Ĭ�Ϸ���
	default void getType(String type) {
		System.out.println("�ö������ڣ�"+type);
	}
	//����һ��Ĭ�Ϸ���
	static int getID() {
		return Animal14.ID;
	}
}
//������LandAnimal�ӿڣ����̳���Animal�ӿ�
interface LandAnimal14 extends Animal14{
	void run();//������󷽷�run����
}
//Dog��ʵ����LandAnimal�ӿ�
class Dog14 implements LandAnimal14{
	//ʵ��dreathe��������
	public void breathe() {
		System.out.println("���ں���");
	}
	//ʵ��run��������
	public void run() {
		System.out.println("����½������");
	}
}
//���������
public class Ex14 {
	public static void main(String[] args) {
		System.out.println(Animal14.getID());//ͨ���ӿ��������෽��
		Dog14 dog = new Dog14();             //����Dog���ʵ������
		System.out.println(dog.ID);          //��ʵ�����л�ȡ�ӿ�ȫ�ֳ���
		dog.breathe();                       //����dog�����breathe()����
		dog.getType("Ȯ��");                  //����dog���󣬵��ýӿ�Ĭ��ֵ
		dog.run();
	}
}
