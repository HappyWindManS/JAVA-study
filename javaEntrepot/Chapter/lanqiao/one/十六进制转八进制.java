package one;

import java.util.Scanner;

public class 十六进制转八进制 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		String[] array = new String[time]; 
		for(int i=0;i<time;i++)
		{
			array[i] = input.next();
		}
		for(int i=0;i<time;i++)
		{
			String temp = array[i];
			int num = Integer.parseInt(temp,16);
			System.out.println(Integer.toString(num,8));		
		}
	}
}
