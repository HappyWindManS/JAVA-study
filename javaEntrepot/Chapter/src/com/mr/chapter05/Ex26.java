package com.mr.chapter05;

import java.text.*;
import java.util.*;
public class Ex26 {
	public static void main(String[] args) throws Exception{
		//����һ��SimpleDateFormat����
		SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy��MM��dd�գ�������yyyy��ĵ�D�죬E");
		//��SimpleDateFormat���������ģ���ʽ��Data����
		System.out.println(sdf.format(new Date()));
	}
}
