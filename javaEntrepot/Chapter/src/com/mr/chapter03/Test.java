package com.mr.chapter03;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student students1=new Student();
		students1.setName("李四");
		students1.setAchievement(19);
		Student students2=new Student("法外狂徒张三",18);
		
		System.out.println("我的名字叫"+students1.getName()+"，我今年"+students1.getAchievement());
		System.out.println("我的名字叫"+students2.getName()+"，我今年"+students2.getAchievement());
	}

}
