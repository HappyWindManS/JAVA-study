package com.mr.chapter04;

//下面代码时自定义一个异常类继承自Exception
public class Ex35 extends Exception{
	public Ex35() {
		super();//调用Exception无参的构造方法
	}
	public Ex35 (String message) {
		super();//调用Exception有参的构造方法
	}
}