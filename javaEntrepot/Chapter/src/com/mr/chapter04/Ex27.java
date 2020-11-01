package com.mr.chapter04;
//����һ������ʽ�ӿ�
@FunctionalInterface
interface Printable27{
	void print(StringUtils27 su,String str);
}
class StringUtils27{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
//���������
public class Ex27 {
	private static void printUpper(StringUtils27 su,String text, Printable27 pt) {
		pt.print(su,text);
	}
	public static void main(String[] args) {
		//ʹ��Lamble���ʽ��ʽ
		printUpper(new StringUtils27(),"Hello",(object,t)->object.printUpperCase(t));
		//ʹ�÷������õķ�ʽ
		printUpper(new StringUtils27(),"Hello",StringUtils27::printUpperCase);
	}
}
