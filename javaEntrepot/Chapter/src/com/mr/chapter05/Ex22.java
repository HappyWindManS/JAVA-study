package com.mr.chapter05;

import java.util.Calendar;

public class Ex22 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		//��ȡ��ʾ������ʱ���Calendar����
		Calendar calendar = Calendar.getInstance();
		//����ָ�����ڣ���month��Ϊ13
		calendar.set(Calendar.MONTH, 13);
		System.out.println(calendar.getTime());
		//����non-lenientģʽ
		calendar.setLenient(false);
		calendar.set(Calendar.MONTH, 13);
		System.out.println(calendar.getTime());
	}

}
