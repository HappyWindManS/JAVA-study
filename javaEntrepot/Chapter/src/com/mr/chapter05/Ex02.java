package com.mr.chapter05;

public class Ex02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "abcabcabcabc";
		System.out.println("字符串的长度为："+s.length());
		System.out.println("字符串的第一个字符："+s.charAt(0));
		System.out.println("字符c第一次出现的位置："+s.indexOf("c"));
		System.out.println("字符c最后一次出现的位置："+s.lastIndexOf("c"));
		System.out.println("子字符第一次出现的位置："+s.indexOf("ab"));
		System.out.println("子字符最后一次出现的位置："+s.lastIndexOf("ab"));
	}

}
