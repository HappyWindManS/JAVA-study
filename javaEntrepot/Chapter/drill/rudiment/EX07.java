package rudiment;

import java.util.Arrays;
import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		//获取第几位数
		int num = input.nextInt();
		//判断在第几列
		int line = 0;
		int temp = 0;

		int i = 1;
		for(;temp<num;i++)
		{
			temp += i;
			line = i;
		}
		int[][] array = new int[line+1][2];
		for(int l=1,s =line;l<line+1;l++,s--)
		{
			array[l][0] = l;
			array[l][1] = s;			
		}


	}
}
