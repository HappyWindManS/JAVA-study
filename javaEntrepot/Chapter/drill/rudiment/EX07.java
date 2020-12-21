package rudiment;

import java.util.Arrays;
import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 当获取一个数时，将其分解成1+2+3+4....+n的形式，然后获取其行数与列数
		 * */
		Scanner input = new Scanner(System.in);
		//获取数
		int num = input.nextInt();
		
		int Column = 1;
		//temp用于记录第几次循环
		int temp = 1;
		while(num>Column)
		{
			num -= Column;
			Column++;
			temp++;
		}
		//复数次的循环一定是1在前
		int laft = 1;
		if(temp%2==0)
		{
			System.out.println(laft+num+"/"+temp);
		}


	}
}
