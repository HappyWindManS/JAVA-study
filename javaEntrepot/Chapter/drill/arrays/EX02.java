package arrays;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int length= input.nextInt();
		int num = input.nextInt();
		
		double[] array=new double[length];
		
		for(int i=0;i<num;i++)
		{		
			int temp =input.nextInt();
			int temp1 = input.nextInt();
			temp1 = temp1!=length?temp1+1:temp1;
			for(int l=(int) temp;l<temp1;l++)
			{
				array[l] = 1;
			}
		}
		int sum = 0;
		for(int i=0;i<array.length;i++)
		{
			sum += array[i];
		}
		System.out.print(length-sum);
	}

}