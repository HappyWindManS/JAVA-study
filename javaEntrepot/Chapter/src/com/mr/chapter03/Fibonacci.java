package com.mr.chapter03;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(Fibonaci(6));
	}
	
	//�������֣�����ȡ�����ϵ���
	public static int Fibonaci(int num)
	{
		if(num==1)
		{
			return 0;
		}
		if(num==2)
		{
			return 1;
		}
		return Fibonaci(num-1)+Fibonaci(num-2);
	}
}
