package com.mr.chapter06;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex08 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList list = new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		
		System.out.println(list);
		//������ת��ΪIterator����������
		Iterator it = list.iterator();
		//ʹ���Դ���foreachRemaining��������������������
		it.forEachRemaining(obj -> System.out.println("��������Ԫ�أ�"+obj));
	}

}
