package com.mr.chapter03;

public class Ex07 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int sum =getSum(4);
		System.out.println(sum);
	}
	
	public static int getSum(int n)
	{
		if(n==1)
		{
			//�߽�����
			return 1;
		}
		int temp =getSum(n-1);
		return temp + n;
	}
}
