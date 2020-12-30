package stringtext;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args){
		// TODO 自动生成的方法存根	
		Scanner input = new Scanner(System.in);
		int[] month = new int[] {0,31,29,31,30,31,30,31,31,30,31,30,31};
		int action = input.nextInt();
		int end =  input.nextInt();
		
		int year = action/10000;
		int endyear = end/10000;
		int sum = 0;
		while(year<=endyear)
		{			
			String temp = String.valueOf(year);
			StringBuffer temp1 = new StringBuffer();
			temp1.append(temp);
			temp1.reverse();
			int i1 = Integer.parseInt(temp1.substring(0,2));
			int i2 = Integer.parseInt(temp1.substring(2,4));
			year++;
			if(i1>12)
			{
				continue;
			}
			if(Integer.parseInt((temp+temp1))>end)
			{
				continue;
			}
			if(month[i1]>=i2)
			{
				if(isH(temp,temp1.toString()))
				{
					sum++;
				}
				else
				{
					continue;
				}				
			}
		}	
		
		
		System.out.println(sum);
	}	
	
	public static boolean isH(String str1,String str2)
	{
		for(int i=0,l=3;i<4;i++,l--)
		{
			if(str1.charAt(i)!=str2.charAt(l))
			{
				return false;
			}
		}
		return true;
	}
}
