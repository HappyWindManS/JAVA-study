package stringtext;

import java.util.Calendar;
import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();	
		Calendar end = Calendar.getInstance();	
		String text1 = input.next();
		String text2 = input.next();
		int year = Integer.parseInt(text1.substring(0, 4));
		int month = Integer.parseInt(text1.substring(4, 6));
		int day = Integer.parseInt(text1.substring(6));
		int year2 = Integer.parseInt(text2.substring(0, 4));
		int month2 = Integer.parseInt(text2.substring(4, 6));
		int day2 = Integer.parseInt(text2.substring(6));
		
		int sum = 0;
		calendar.set(year,month,day);
		end.set(year2,month2,day2);
		System.out.println(calendar.getTime());
		System.out.println(end.getTime());
		System.out.println(end.getTime()-calendar.getTime());
		while(calendar.getTime().equals(end.getTime()))
		{
			int tempYear =calendar.get(Calendar.YEAR);
			int tempMonth = calendar.get(Calendar.MONTH);
			int tempDay = calendar.get(Calendar.DATE);
			
			String ref = (tempMonth<10?"0"+tempMonth:String.valueOf(tempMonth))+(tempDay<10?"0"+tempDay:String.valueOf(tempDay));
			if(isHW(String.valueOf(tempYear),ref))
			{
				sum++;
			}		
			calendar.add(Calendar.DATE, 1);
		}
		System.out.println(sum);
	}
	
	public static boolean isHW(String str1,String str2)
	{
		boolean bool = true;
		for(int i=0,time=str1.length(),l=time-1;i<time;i++,l--)
		{
			if(str1.charAt(i)!=str2.charAt(l))
			{
				return false;
			}
		}
		return bool;
	}

}
