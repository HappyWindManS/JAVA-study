package com.mr.chapter06;

import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList list = new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		
		//ʹ��foreach������������
		list.forEach(obj->System.out.println("��������Ԫ�أ�"+obj));
	}

}
