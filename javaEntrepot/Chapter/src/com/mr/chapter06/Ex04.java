package com.mr.chapter06;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList list = new ArrayList();
		
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		//ʹ��foreachѭ����������
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}

}
