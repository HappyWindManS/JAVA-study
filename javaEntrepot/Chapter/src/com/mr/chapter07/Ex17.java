package com.mr.chapter07;

import java.io.*;

public class Ex17 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		RandomAccessFile raf = new RandomAccessFile("time.txt","rw");
		
		int times = Integer.parseInt(raf.readLine())-1;
		
		/*
		if(times>0)
		{
			System.out.println("剩余:"+times);
			raf.seek(0);
			raf.write((times+"").getBytes());
		}else
		{
			System.out.print("over");
		}*/
		raf.close();
	}

}
