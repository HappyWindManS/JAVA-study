package stringtext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Calendar;
import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		int sum = 0;
		Scanner input = new Scanner(System.in);
		int action = input.nextInt();
		String end =  input.next();
		
		int year = action/10000;
		int month = action/100%100;
		int day = action%100;
		
		String temp;
		while()
		{
			
		}
		Calendar calendar = Calendar.getInstance();
		
		
		
		System.out.println(sum);
	}
	
	public static boolean isHW(String text)
	{
		for(int i=0,l=text.length();i<l;i++,l--)
		{
			if(text.charAt(i)!=text.charAt(l))
			{
				return false;
			}
		}
		return true;
	}
	
}
