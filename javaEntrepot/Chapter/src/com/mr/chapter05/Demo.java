package com.mr.chapter05;

public class Demo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		final String text = "HelloWorld";
		String str = ascllCnv(text);
		System.out.print(str);
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

}
