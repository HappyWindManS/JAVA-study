package com.mr.chapter03;

public class Ex05 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum = add01(1,2);
		int sum2 = add02(3,4,7);
		double sum3 = add03(0.2,5.3);
		
		System.out.println("sum1="+sum);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
	}
	public static int add01(int x,int y)
	{
		return x+y;
	}
	
	public static int add02(int x,int y,int z)
	{
		return x+y+z;
	}
	
	public static double add03(double x,double y)
	{
		return x+y;
	}
}
