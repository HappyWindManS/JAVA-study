package com.mr.chapter06;

public class Ex05 {
	
	static String[] array = {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		//1.foreachѭ����������
		for(String str:array)
		{
			str = "ddd";
		}
		System.out.println("foreach�޸Ĺ�������飺"+array[0]+","+array[1]+","+array[2]);
		
		//2.forѭ����������
		for(int i=0;i<array.length;i++)
		{
			array[i] = "ddd";
		}
		System.out.println("forѭ���޸Ĺ�������飺"+array[0]+","+array[1]+","+array[2]);
	}

}