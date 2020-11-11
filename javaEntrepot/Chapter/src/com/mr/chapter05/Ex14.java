package com.mr.chapter05;

public class Ex14 {

	public static void main(String[] args)throws Exception {
		// TODO 自动生成的方法存根
		
		//创造一个Runtime实例对象
		Runtime rt = Runtime.getRuntime();
		//得到表示进程的Process
		//Process对象用于与Runtime实例exec方法
		//用于获取exec方法交互的软件的信息
		Process process = rt.exec("notepad.exe");
		
		//程序休眠三秒
		Thread.sleep(3000);
		//关闭进程
		process.destroy();
		
	}

}
