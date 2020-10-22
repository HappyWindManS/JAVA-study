package com.mr.chapter02;

public class Ex18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ids=new int[100];
		System.out.println("ids[0]="+ids[0]);
		System.out.println("ids[99]="+ids[99]);
		System.out.println("===========================");
		
		String[] names = new String[]{"张三","tom","jack"};
		System.out.println("names[0]"+names[0]);
		System.out.println("names[2]="+names[2]);
		System.out.println("===========================");

		Object[] object = {"张三","tom","jack"};
		System.out.println("数组的长度为："+object.length);
		System.out.println("object[0]"+object[0]);
		System.out.println("object[2]="+object[2]);
	}

}
