package com.mr.chapter05;

import java.util.Calendar;

public class Ex22 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		//获取表示当期那时间的Calendar对象
		Calendar calendar = Calendar.getInstance();
		//设置指定日期，将month设为13
		calendar.set(Calendar.MONTH, 13);
		System.out.println(calendar.getTime());
		//开启non-lenient模式
		calendar.setLenient(false);
		calendar.set(Calendar.MONTH, 13);
		System.out.println(calendar.getTime());
	}

}
