package com.mr.chapter04;
//定义一个函数式接口
@FunctionalInterface
interface Printable27{
	void print(StringUtils27 su,String str);
}
class StringUtils27{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
//定义测试类
public class Ex27 {
	private static void printUpper(StringUtils27 su,String text, Printable27 pt) {
		pt.print(su,text);
	}
	public static void main(String[] args) {
		//使用Lamble表达式方式
		printUpper(new StringUtils27(),"Hello",(object,t)->object.printUpperCase(t));
		//使用方法引用的方式
		printUpper(new StringUtils27(),"Hello",StringUtils27::printUpperCase);
	}
}
