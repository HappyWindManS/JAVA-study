package com.mr.chapter05;

public class Ex12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("处理器的个数:"+rt.availableProcessors()+"个");
		
		System.out.println("空闲内存大小:"+rt.freeMemory()/1024/1024+"M");
		
		System.out.println("最大可用内存大小:"+rt.maxMemory()/1024/1024+"M");
	}

}
