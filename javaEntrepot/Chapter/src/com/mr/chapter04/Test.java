package com.mr.chapter04;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student student = new Student("张然",18);
		Undergraduate und=new Undergraduate("张三",20,"物联网工程");
		student.show();
		und.show();
		
		
		Square square=new Square();
		Circle cirele=new Circle();
		System.out.println(square.area(2));
		System.out.println(cirele.area(3));
		
	}

}
