package com.mr.chapter04;

public class Ex28 {
	//����ķ���ʵ���������������
	public static int divide(int x,int y) {
		int result = x/y;//����һ������result��¼����������Ľ��
		return result;//�����ؽ��
	}
	public static void main(String[] args) {
		int result = divide(4,0);//����divide��������
		System.out.println(result);
	}
}
