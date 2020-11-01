package com.mr.chapter04;

public class Ex32 {
	//下面的方法实现了两个整数相除，并使用throws关键字声明抛出异常
	public static int divide(int x,int y)throws Exception{
		int result = x/y;//定义一个变量result记录两个数相除的结果
		return result;
	}
	public static void main(String[] args) {
		try {
			int result = divide(4,0);//调用divide方法
			System.out.println(result);
		}catch(Exception e) {//对捕获到的异常进行处理
			System.out.println("捕获的异常信息为："+e.getMessage());
		}
	}
}
