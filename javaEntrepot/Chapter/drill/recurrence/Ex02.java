package recurrence;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//一定是奇数个奇数的和才是奇数
		//则，当有X个整数的时候，从中选出Y个数相加，得到的奇数一定是
		// NUM = 奇数+偶数个偶数的和 OR 奇数个奇数的和
		//则，需要Y个整数相加的时候
		//奇数的条件一定为(奇数个奇数+偶数个偶数)
		//----------------------------------------
		//当存在4个数，任选三个时
		//应有 sum = n(n%2=1)*j+m(m%2=0)*o
		//sum =  
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int time = input.nextInt();
		int[] array = new int[number];
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		for(int i =0;i<number;i++)
		{
			array[i] = input.nextInt();
		}
		for(int i=0;i<number;i++)
		{
			
		}
	}

}
