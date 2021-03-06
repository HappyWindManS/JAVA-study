package com.mr.chapter07;

public class demo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		WindowsTicketsRunnable mr = new WindowsTicketsRunnable();
		new Thread(mr,"窗口A").start();
		new Thread(mr,"窗口B").start();
		new Thread(mr,"窗口C").start();
		new Thread(mr,"窗口D").start();
		
		new WindowsTicketsThread("窗口A").start();
		new WindowsTicketsThread("窗口B").start();
		new WindowsTicketsThread("窗口C").start();
		new WindowsTicketsThread("窗口D").start();
	}
}

class WindowsTicketsRunnable implements Runnable {
	int ticket=100;
	
	public void run() {
		while(true) {
			if(ticket<=0) break;
			System.out.println(Thread.currentThread().getName()+"售出第 "+(ticket--)+" 张票");
		}
	}
}

class WindowsTicketsThread extends Thread {
	public WindowsTicketsThread(){
		super();
	}
	
	public WindowsTicketsThread(String name){
		super(name);
	}
	
	static int ticket=100;
	
	public void run() {
		while(true) {
			if(ticket<=0) break;
			System.out.println(Thread.currentThread().getName()+"售出第 "+(ticket--)+" 张票");
		}
	}
}
