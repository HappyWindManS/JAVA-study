package test;

import java.math.BigInteger;
import java.util.Scanner;

public class P1255数楼梯 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();	
		BigInteger num1 = new BigInteger("1");
		BigInteger num2 = new BigInteger("2");
		BigInteger temp = new BigInteger("0");
		if(num<=2)
		{
			System.out.println(num);
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				temp = num1.add(num2);
				num1 = num2;
				num2 = temp;
			}
			System.out.println(temp);
		}
	}
}
