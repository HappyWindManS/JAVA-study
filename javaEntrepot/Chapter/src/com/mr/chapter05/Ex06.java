package com.mr.chapter05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str = "2018-01-24";
		//�ַ�����ȡ
		System.out.println("�ӵ�6���ַ���ȡ��ĩβ�Ľ����"+str.substring(5));
		System.out.println("�ӵ�6���ַ���ȡ����7���ַ��Ľ����"+str.substring(5,7));
		//�ַ����ָ�
		System.out.print("�ָ����ַ��������е�Ԫ������Ϊ��");
		
		String[] strArray = str.split("-");
		
		for(String text:strArray)
		{
			System.out.print(text+"/");
		}
		System.out.printf("\b");
	}

}
