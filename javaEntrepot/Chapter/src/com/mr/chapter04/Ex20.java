package com.mr.chapter04;
//�����ⲿ��Outer
class Outer20{
	static int m = 0;//�����ⲿ�ྲ̬����m
	static class Inner{
		void show() {
			//��̬�ڲ�������ⲿ�ྲ̬��Ա
			System.out.println("�ⲿ�ྲ̬���� m="+m);
		}
	}
}
//���������
public class Ex20 {
	public static void main(String[] args) {
		//��̬�ڲ������ֱ��ͨ���ⲿ�ഴ��
		Outer20.Inner inner = new Outer20.Inner();
		inner.show();
	}
}
