package com.mr.chapter06;

import java.util.TreeSet;

public class Ex11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(3);
		ts.add(9);
		ts.add(1);
		ts.add(21);
		
		System.out.println("������TreeSet����Ϊ��"+ts);
		//2.��ȡ��βԪ��
		System.out.println("TreeSet������Ԫ��Ϊ��"+ts.first());
		System.out.println("TreeSet����βԪ��Ϊ��"+ts.last());
		
		//�Ƚϲ���ȡԪ��
		System.out.println("������С�ڻ����9�����һ����Ԫ��Ϊ��"+ts.floor(9));
		System.out.println("�����д���10����С��һ��Ԫ��Ϊ��"+ts.higher(10));
		System.out.println("�����д���100����С��һ��Ԫ��Ϊ��"+ts.higher(100));
		
		Object first =ts.pollFirst();
		System.out.println("ɾ���ĵ�һ��Ԫ��Ϊ��"+first);
		System.out.println("ɾ����һ��Ԫ�غ�TreeSet���ϱ�Ϊ:"+ts);
		
	}

}