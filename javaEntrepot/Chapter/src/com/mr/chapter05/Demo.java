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
}
