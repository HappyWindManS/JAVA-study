package com.mr.chapter03;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(Fibonaci(6));
	}
	
	//输入数字，来获取数列上的数
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
