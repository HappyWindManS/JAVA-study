package com.mr.chapter06;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex13 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add("Jack");
		ts.add("Helena");
		ts.add("Eve");
		System.out.println(ts);
		
		//lambda����ʽ���ƹ���
		TreeSet ts2= new TreeSet((obj1,obj2) -> {
			String s1 = (String)obj1;
			String s2 = (String)obj2;
			return s1.length() - s2.length();
		});
		ts2.add("Jack");
		ts2.add("Helena");
		ts2.add("Eve");
		System.out.println(ts2);
	}

}

class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO �Զ����ɵķ������
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s1.length()-s2.length();
	}
	
}