package com.mr.chapter04;
//定义一个函数式接口
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
//定义测试类
public class Ex25 {
	private static void printUpper(String test,Printable pt) {
		pt.print(test);
	}
	public static void main(String[] args) {
		StringUtils stu = new StringUtils();
		//使用Lambda表达方式
		printUpper("Hello",t->stu.printUpperCase(t));
		//使用方法引用式
		printUpper("Hello",stu::printUpperCase);
	}
}
