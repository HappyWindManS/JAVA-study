package com.mr.chapter05;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final String text = "HelloWorld";
		String str = ascllCnv(text);
		System.out.println(str);
		
		System.out.println(Cnv(text));
	}
	
	public static String ascllCnv(String text)
	{
		char[] array = text.toCharArray();
		String temp = "";
		for(int i = array.length-1;i>=0;i--)
		{
			if((int)array[i]>95)
			{
				temp += String.valueOf((char)((int)array[i]-32));
			}
			else{
				temp += String.valueOf((char)((int)array[i]+32));
			}
		}
		return String.valueOf(temp);
	}

	public static String Cnv(String text)
	{
		char[] cArray = text.toCharArray();
		StringBuffer ref = new StringBuffer();
		for(Character ch:cArray)
		{
			if(Character.isLowerCase(ch))
			{
				ref.append(Character.toUpperCase(ch));
			}
			else
			{
				ref.append(Character.toLowerCase(ch));
			}
		}
		return ref.reverse().toString();
	}
}
