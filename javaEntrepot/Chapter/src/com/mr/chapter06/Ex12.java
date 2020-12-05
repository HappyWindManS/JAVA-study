package com.mr.chapter06;

import java.util.TreeSet;

public class Ex12 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TreeSet<Teacher> ts = new TreeSet<Teacher>();
		ts.add(new Teacher("Jack",19));
		ts.add(new Teacher("Rose",19));
		ts.add(new Teacher("Tom",19));
		ts.add(new Teacher("Rose",18));
		System.out.println(ts);
	}

}

class Teacher implements Comparable{
	
	String name;
	int age;
	
	public Teacher(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return name+":"+age;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO �Զ����ɵķ������
		Teacher s = (Teacher)o;
		//����ȽϷ�ʽ���ȱȽ�����age,�ڱȽ�����name
		if(this.age - s.age > 0)
		{
			return 1;
		}
		if(this.age - s.age == 0)
		{
			return this.name.compareTo(s.name);
		}
		return -1;
	}
	
}