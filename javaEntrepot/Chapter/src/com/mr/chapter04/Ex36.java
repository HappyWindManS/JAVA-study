package com.mr.chapter04;

public class Ex36 {
	//����ķ�ʽʵ���������������
	public static int divide(int x,int y)throws Ex35{
		if(y == 0) {
			//ʹ��throw�ؼ��������쳣����
			throw new Ex35("������0");
		}
		int result = x/y;//����һ������result��¼����������Ľ��
		return result;//���������
	}
	public static void main(String[] args) {
		try {
			int result = divide(4,0);
			System.out.println(result);
		}catch(Ex35 e) {
			System.out.println("���������ϢΪ��"+e.getMessage());
		}
	}
}
