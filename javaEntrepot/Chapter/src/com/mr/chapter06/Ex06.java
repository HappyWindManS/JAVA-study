package com.mr.chapter06;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex06 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList list= new ArrayList();
		list.add("jack");
		list.add("annie");
		list.add("rose");
		list.add("tom");
		
		//��Ԫ�ر�ɾ���󣬵������ڼ��������������еĴ�����Ԫ�ز�һ�£��ͻ��������
		/*
		 * ���ַ���
		 * 1.��������������ɾ�����Ҳ�����֮���Ԫ��ʱ������break����ѭ��
		 * 2.ʹ�õ�����������ɾ����������ɾ�����������ʣ�����д�����Ԥ֪
		 * */
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if("annie".equals(obj))
			{
				//list.remove(obj);
				it.remove();
			}
		}
		System.out.println(list);
	}

}