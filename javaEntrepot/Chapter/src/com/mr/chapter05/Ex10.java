package com.mr.chapter05;

public class Ex10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long startTime = System.currentTimeMillis();
		int sum =0 ;
		for(int i=0;i<100000000;i++)
		{
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("程序运行时间为："+(endTime - startTime)+"毫秒");
	}

}
