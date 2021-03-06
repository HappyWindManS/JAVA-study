package com.mr.chapter06;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet<Person> hs = new HashSet<Person>();
		hs.add(new Person("Lucy",19));
		hs.add(new Person("Tom",19));
		hs.add(new Person("Lucy",18));
		hs.forEach(obj -> System.out.println(obj.name+obj.age));
	}

}

class Person 
{
	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int hashCode(){
		return name.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		Person p = (Person)obj;
		if(this.name == p.name)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
