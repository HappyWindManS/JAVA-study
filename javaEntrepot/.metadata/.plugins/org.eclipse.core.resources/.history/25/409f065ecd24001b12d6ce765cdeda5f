package com.mr.chapter05;

import java.time.*;
import java.time.format.*;
public class Ex29 {
	public static void main(String[] args) {
		//定义两种日期格式的字符串
		String str1 = "2018-01-27 12:38:36";
		String str2 = "2018年1月29日 15时01分20秒";
		//定义解析所用的格式器
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
		//使用LocalDateTime的parse()方法执行解析
		LocalDateTime localdatetime1 = LocalDateTime.parse(str1,formatter1);
		LocalDateTime localdatetime2 = LocalDateTime.parse(str2,formatter2);
		//输出结果
		System.out.println(localdatetime1);
		System.out.println(localdatetime2);
	}
}
