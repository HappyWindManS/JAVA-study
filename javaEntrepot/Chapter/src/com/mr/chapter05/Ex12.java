package com.mr.chapter05;

public class Ex12 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("�������ĸ���:"+rt.availableProcessors()+"��");
		
		System.out.println("�����ڴ��С:"+rt.freeMemory()/1024/1024+"M");
		
		System.out.println("�������ڴ��С:"+rt.maxMemory()/1024/1024+"M");
	}

}
