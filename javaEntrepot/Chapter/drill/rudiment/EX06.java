package rudiment;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		double time = input.nextDouble();
		double temp = input.nextDouble();
		
		String num ="";
		for(int i=1;i<=time;i++)
		{
			num+=i;		
		}
		for(int i=0;i<10;i++)
		{
			if(i!=temp)
			{
				String c = String.valueOf(i);
				num = num.replace(c, "");
			}
		}
		System.out.print(num.length());
	}
}
