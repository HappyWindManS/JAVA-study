package com.mr.chapter04;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Student student = new Student("��Ȼ",18);
		Undergraduate und=new Undergraduate("����",20,"����������");
		student.show();
		und.show();
		
		
		Square square=new Square();
		Circle cirele=new Circle();
		System.out.println(square.area(2));
		System.out.println(cirele.area(3));
		
	}

}
