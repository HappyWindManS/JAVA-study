package recurrence;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		long num1 = input.nextLong();
		long num2 = input.nextLong();
		long num3 = input.nextLong();
		long temp = num2 - num1;
		long sum = num3*num1+num3*(num3-1)*temp/2;
		
		System.out.println(sum);

	}

}
