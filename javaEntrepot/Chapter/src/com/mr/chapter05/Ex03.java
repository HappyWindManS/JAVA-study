package com.mr.chapter05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str = "java";
		char[] charArray = str.toCharArray();
		System.out.print("将字符串转为字符数组的遍历结果：");
		
		for(int i=0;i<charArray.length;i++)
		{
			if(i != charArray.length - 1)
			{
				System.out.print(charArray[i]+",");
			}
			else
			{
				System.out.println(charArray[i]);
			}
		}
		System.out.println("将int值转换为String类型之后的结果"+String.valueOf(12));
		
		System.out.println("将字符串转换成大写之后的结果："+str.toUpperCase());
	}

}
