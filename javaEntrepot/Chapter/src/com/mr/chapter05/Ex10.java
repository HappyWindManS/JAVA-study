package com.mr.chapter05;

public class Ex10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		long startTime = System.currentTimeMillis();
		int sum =0 ;
		for(int i=0;i<100000000;i++)
		{
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("��������ʱ��Ϊ��"+(endTime - startTime)+"����");
	}

}
