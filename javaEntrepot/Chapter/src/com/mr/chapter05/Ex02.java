package com.mr.chapter05;

public class Ex02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s = "abcabcabcabc";
		System.out.println("�ַ����ĳ���Ϊ��"+s.length());
		System.out.println("�ַ����ĵ�һ���ַ���"+s.charAt(0));
		System.out.println("�ַ�c��һ�γ��ֵ�λ�ã�"+s.indexOf("c"));
		System.out.println("�ַ�c���һ�γ��ֵ�λ�ã�"+s.lastIndexOf("c"));
		System.out.println("���ַ���һ�γ��ֵ�λ�ã�"+s.indexOf("ab"));
		System.out.println("���ַ����һ�γ��ֵ�λ�ã�"+s.lastIndexOf("ab"));
	}

}
