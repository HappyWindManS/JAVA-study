package com.mr.chapter04;
//�����ⲿOuter
class Outer18{
	int m = 0;//�����ⲿ��ĳ�Ա����
	//�����ⲿ���Ա����
	void test1() {
		System.out.println("�ⲿ���Ա����");
	}
	//�����Ա�ڲ���inner
	class Inner{
		int n = 1;
		//1.�����ڲ��෽���������ⲿ���Ա�����ͷ���
		void show1() {
			System.out.println("�ⲿ���Ա���� m="+m);
			test1();
		}
		void show2() {
			System.out.println("�ڲ����Ա����");
		}
	}
	//2.�����ⲿ�෽���������ڲ�������ͷ���
	void test2() {
		Inner inner = new Inner();
		System.out.println("�ڲ����Ա���� n="+inner.n);
		inner.show2();
	}
}
//���������
public class Ex18 {
	public static void main(String[] args) {
		Outer18 outer = new Outer18();//�����ⲿ�����
		Outer18.Inner inner = outer.new Inner();//�����ڲ������
		inner.show1();//�����ڳ�Ա�ڲ����з����ⲿ���Ա�����ͷ���
		outer.test2();//�������ⲿ���з����ڲ����Ա�����ͷ���
	}
}