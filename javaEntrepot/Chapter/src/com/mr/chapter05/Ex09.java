package com.mr.chapter05;

import java.util.Properties;
import java.util.Set;

public class Ex09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		Set<String> propertyNames = properties.stringPropertyNames();
		for(String key:propertyNames)
		{
			String value =System.getProperty(key);
			System.out.println(key + "--->" + value);
		}
	}

}
