package com.mr.chapter04;

public class Ex33 {
	//����ķ���ʵ�������������������ʹ��throws�ؼ��������׳��쳣
	public static int divide(int x,int y)throws Exception{
		int result = x/y;//����һ������result��¼����������Ľ��
		return result;//���������
	}
	public static void main(String[] args)throws Exception {
		//����divide������������ʹ��throws�ؼ��ּ������쳣�׳�
		int result = divide(4,0);
		System.out.println(result);
	}
}
