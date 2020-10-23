package com.mr.chapter03;

public class Ex06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum1 = add(1,2);
		int sum2 = add(3,4,7);
		double sum3 = add(0.2,5.3);
		
		System.out.println("sum1 = " +sum1);
		System.out.println("sum2 = " +sum2);
		System.out.println("sum3 = " +sum3);
	}
	
	public static int add(int x,int y)
	{
		return x+y;
	}
	public static int add(int x,int y,int z)
	{
		return x+y+z;
	}
	public static double add(double x,double y)
	{
		return x+y;
	}
	
}
