package com.mr.chapter05;

import java.util.Random;

public class Ex16 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Random r = new Random();
		System.out.println("����boolean���͵��������"+r.nextBoolean());
		
		System.out.println("����double���͵��������"+r.nextDouble());
		
		System.out.println("����float���͵��������"+r.nextFloat());
		
		System.out.println("����int���͵��������"+r.nextInt());
		
		System.out.println("����0��10֮��int���͵��������"+r.nextInt(10));
		
		System.out.print("����long���͵��������"+r.nextLong());
	}

}
