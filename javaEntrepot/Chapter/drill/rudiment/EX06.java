package rudiment;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		int get = input.nextInt();
		int sum = 0;
		int num;
		for(int i=0;i<=time;i++)
		{
			num = i;
			while(!(num < 1))
			{
				if(num%10==get)
				sum++;
				num /= 10;
			}
		}
		System.out.println(sum);
	}
	
}
