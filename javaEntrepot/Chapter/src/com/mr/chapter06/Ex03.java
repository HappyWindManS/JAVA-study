package com.mr.chapter06;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList list = new ArrayList();
		//��ü���������ַ���
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		//��ȡIterator����
		Iterator iterator = list.iterator();
		
				//����hasNext()�����ж��Ƿ���Ԫ��
		
		while(iterator.hasNext())
		{
			Object obj = iterator.next();
			System.out.println(obj);
		}
	}

}
