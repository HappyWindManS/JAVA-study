package com.mr.chapter05;

import java.util.Date;

public class Ex19 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		//������ʾ��ǰʱ���Date����
		Date date1 = new Date();
		//��ȡ��ǰʱ���1���ʱ��
		Date date2 = new Date(System.currentTimeMillis()+1000);
		System.out.println(date1);
		System.out.println(date2);
	}

}
