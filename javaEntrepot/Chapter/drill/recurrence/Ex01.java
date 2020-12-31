package recurrence;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int num = input.nextInt()/2;
		int[] array = new int[num+1];
		for(int i=1;i<num+1;i++)
		{
			int temp = i/2;
			for(int l = temp;l>0;l--)
			{
				array[i] += array[l];
			}
			array[i]++;
		}
		int sum = 1;
		for(int i=0;i<num+1;i++)
		{
			sum += array[i];
		}
		System.out.println(sum);
	}
	
}
