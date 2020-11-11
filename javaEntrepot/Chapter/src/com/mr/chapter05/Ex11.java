package com.mr.chapter05;

public class Ex11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] srcArray = {101,102,103,104,105,106};
		int[] destArray = {201,202,203,204,205};
		
		//参数src:源目标数组
		//参数srcPos:指源目标数组的第几位
		//参数dest:目标数组
		//参数destPos:从目标数组的第几位开始粘贴
		//参数length:拷贝的元素个数
		System.arraycopy(srcArray, 2, destArray, 0, 4);
		
		for(int num:destArray)
		{
			System.out.println(num);
		}
	}

}
