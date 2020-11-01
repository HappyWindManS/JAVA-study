package com.mr.chapter04;
//����һ������ʽ�ӿ�
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
//���������
public class Ex25 {
	private static void printUpper(String test,Printable pt) {
		pt.print(test);
	}
	public static void main(String[] args) {
		StringUtils stu = new StringUtils();
		//ʹ��Lambda��﷽ʽ
		printUpper("Hello",t->stu.printUpperCase(t));
		//ʹ�÷�������ʽ
		printUpper("Hello",stu::printUpperCase);
	}
}
