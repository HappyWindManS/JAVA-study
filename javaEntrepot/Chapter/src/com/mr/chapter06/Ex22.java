package com.mr.chapter06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex22 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO 自动生成的方法存根
		 
		Properties pps = new Properties();
		pps.load(new FileInputStream("D:/GITHUB/JAVA-study/javaEntrepot/Chapter/src/com/mr/chapter06/Ex21.properties"));
		pps.forEach((k,v)->System.out.println(k+":"+v));
		FileOutputStream out = new FileOutputStream("D:/GITHUB/JAVA-study/javaEntrepot/Chapter/src/com/mr/chapter06/Ex21.properties");
		pps.setProperty("charset", "utf-8");
		pps.store(out, "新增charset编码");
	}

}
