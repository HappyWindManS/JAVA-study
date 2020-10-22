package com.mr.chapter02;

public class Ex19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ids = new int[100];
		System.out.println("ids[0]="+ids[0]);
		ids[0] = 2500;
		System.out.println("ids[0]="+ids[0]);
		System.out.println("========================");
		String[] names = new String[]{"张三","tom","jack"};
		System.out.println("names[0]="+names[0]);
		names[0] = "李四";
		System.out.println("names[0]="+names[0]);
		System.out.println("========================");
		Object[] object = {"张三","tom","jack"};
		System.out.println("object[0]="+object[0]);
		object[0] = "李四";
		System.out.println("object[0]="+object[0]);
	}

}
