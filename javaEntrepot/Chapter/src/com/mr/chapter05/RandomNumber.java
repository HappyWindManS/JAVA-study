package com.mr.chapter05;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=0;i<5;i++)
		{
			System.out.printf("�������%d\n",getRandom(20,30));
		}
	}
	
	public static int getRandom(int min,int max)
	{
		Random random = new Random();
		return min+random.nextInt(max-min+1);
	}
}