package com.mr.chapter05;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final String text = "HelloWorld";
		
		
		long startTime = System.currentTimeMillis();
		for(int i =0;i<100000000;i++)
			Cnv(text);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		/*
		long startTime1 = System.currentTimeMillis();
		for(int i =0;i<100000000;i++)
			Teacher(text);
		long endTime1 = System.currentTimeMillis();
		
		System.out.println(endTime1 - startTime1);
		*/
	}
	
	public static String ascllCnv(String text)
	{
		char[] array = text.toCharArray();
		StringBuffer temp = new StringBuffer();
		for(int i = array.length-1;i>=0;i--)
		{
			int num = (int)array[i];
			if(num>95)
			{
				temp.append((char)(num-32));
			}
			else{
				temp.append((char)(num+32));
			}
		}
		return temp.toString();
	}

	public static String Cnv(String text)
	{
		char[] cArray = text.toCharArray();
		StringBuffer ref = new StringBuffer();
		for(Character ch:cArray)
			ref.append(Character.isLowerCase(ch)?Character.toUpperCase(ch):Character.toLowerCase(ch));
		return ref.reverse().toString();
	}
	
	public static String Teacher(String text)
	{
		char[] ch = text.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i= ch.length-1;i>=0;i--)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				sb.append(String.valueOf(ch[i]).toLowerCase());		
			}
			else
			{
				sb.append(String.valueOf(ch[i]).toUpperCase());	
			}
		}
		return sb.toString();
	}
}
