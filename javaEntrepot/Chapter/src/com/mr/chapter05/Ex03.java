package com.mr.chapter05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str = "java";
		char[] charArray = str.toCharArray();
		System.out.print("���ַ���תΪ�ַ�����ı��������");
		
		for(int i=0;i<charArray.length;i++)
		{
			if(i != charArray.length - 1)
			{
				System.out.print(charArray[i]+",");
			}
			else
			{
				System.out.println(charArray[i]);
			}
		}
		System.out.println("��intֵת��ΪString����֮��Ľ��"+String.valueOf(12));
		
		System.out.println("���ַ���ת���ɴ�д֮��Ľ����"+str.toUpperCase());
	}

}
