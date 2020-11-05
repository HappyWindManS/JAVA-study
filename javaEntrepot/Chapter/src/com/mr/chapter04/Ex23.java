package com.mr.chapter04;
//�����޲Ρ��޷���ֵ�ĺ���ʽ�ӿ�
@FunctionalInterface
interface Animal23{
	void shout();
}
//�����вΣ��з���ֵ�ĺ����ӿ�
interface Calculate{
	int sum(int a,int b);
}
public class Ex23 {
	public static void main(String[] args) {
		//�ֱ���������ʽ�ӿڽ��в���
		animalShout(()->System.out.println("�޲Ρ��޷���ֵ�ĺ���ʽ�ӿڵ���"));
		showSum(10,20,(x,y) ->x+y);
	}
	//����һ������еķ�����������ӿڶ���animal��Ϊ����
	private static void animalShout(Animal23 animal) {
		animal.shout();
	}
	//����һ����͵ķ���������������int�����Լ��ӿ�Calculate���͵Ĳ���
	private static void showSum(int x,int y,Calculate calculate) {
		System.out.println(x+"+"+y+"�ĺ�Ϊ��"+calculate.sum(x,y));
	}
}