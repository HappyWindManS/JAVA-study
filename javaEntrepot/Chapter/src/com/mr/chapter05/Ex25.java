package com.mr.chapter05;

import java.text.*;

public class Ex25 {
	public static void main(String[] args) throws ParseException {
		
		//����DateFormat����
		DateFormat dt1 = DateFormat.getDateInstance();
		//����Long��ʽ��DateForamt����
		DateFormat dt2 = DateFormat.getDateInstance(DateFormat.LONG);
		//�����������ڸ�ʽ���ַ���
		String str1 = "2008-01-27";
		String str2 = "2018��01��27��";
		//�����Ӧ�ĸ�ʽ���ַ���������Date�����Ľ��
		System.out.println(dt1.parse(str1));
		System.out.println(dt2.parse(str2));
	}
}