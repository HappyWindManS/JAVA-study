package com.mr.chapter05;


public class demo2 {
	
	public static int time = 0;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(x(x(8)));
		System.out.println(time);
	}

	public static int x(int num)
	{
			time++;
			if(num<=3)
			{
				return 1;
			}
			return x(num-2)+x(num-4)+1;
	}
}
