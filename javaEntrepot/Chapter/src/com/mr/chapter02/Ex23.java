package com.mr.chapter02;

public class Ex23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,6,3,9,8};
		int max = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("数组中的最大数为："+max);
	}

}
