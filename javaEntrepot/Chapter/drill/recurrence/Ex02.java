package recurrence;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//一定是奇数个奇数的和才是奇数
		//则，当有若干个奇数的时候
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int time = input.nextInt();
		int[] array = new int[number];
		for(int i =0;i<number;i++)
		{
			array[i] = input.nextInt()%2;
		}
		
	}

}
