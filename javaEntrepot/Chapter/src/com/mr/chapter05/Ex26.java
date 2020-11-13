package com.mr.chapter05;

import java.text.*;
import java.util.*;
public class Ex26 {
	public static void main(String[] args) throws Exception{
		//创建一个SimpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年MM月dd日：今天是yyyy年的第D天，E");
		//按SimpleDateFormat对象的日期模板格式化Data对象
		System.out.println(sdf.format(new Date()));
	}
}
