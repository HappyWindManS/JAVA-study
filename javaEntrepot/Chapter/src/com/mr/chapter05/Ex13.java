package com.mr.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		/*
		Runtime rt = Runtime.getRuntime();
		rt.exec("ping www.baidu.com");
		*/
		Process p = Runtime.getRuntime().exec("ping 47.116.134.206");
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), "GBK"));
		String line = null;
		StringBuffer text = new StringBuffer();
		while ((line = br.readLine()) != null) {
			text.append(line + "\n");
		}
		System.out.println(text.toString());
	}

}
