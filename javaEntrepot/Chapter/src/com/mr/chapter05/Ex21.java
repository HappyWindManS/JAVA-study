package com.mr.chapter05;

import java.util.Calendar;

public class Ex21 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		//��ȡ��ʾ��ǰʱ���Calendar����
		Calendar calendar=Calendar.getInstance();
		//����ָ������
		calendar.set(2018,1,1);
		//Ϊָ����������ʱ��
		calendar.add(Calendar.DATE, 100);
		//����ָ�����ڵ���
		int year = calendar.get(Calendar.YEAR);
		//����ָ�����ڵ���
		int month = calendar.get(Calendar.MONTH);
		//����ָ�����ڵ���
		int date = calendar.get(Calendar.DATE);
		System.out.println("�ƻ���������Ϊ��"+year+"��"+month+"��"+date+"��");
	}

}
