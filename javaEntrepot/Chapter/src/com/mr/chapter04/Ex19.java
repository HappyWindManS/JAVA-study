package com.mr.chapter04;
//�����ⲿ��Outer
class Outer19{
	int m = 0;
	void test1() {
		System.out.println("�ⲿ��Ա����");
	}
	void test2() {
		//1.����ֲ��ڲ���Inner���ھֲ��ڲ����з����ⲿ������ͷ���
		class Inner{
			int n = 1;
			void show() {
				System.out.println("�ⲿ����� m="+m);
				test1();
			}
		}
		//2.�ڴ������ڲ���ķ����У����þֲ��ڲ�������ͷ���
		Inner inner = new Inner();
		System.out.println("�ֲ��ڲ������ n="+inner.n);
		inner.show();
	}
}
//���������
public class Ex19 {
	public static void main(String[] args) {
		Outer19 outer = new Outer19();
		outer.test2();//ͨ���ⲿ�������ô����˾ֲ�ÿ����ķ���
	}
}
