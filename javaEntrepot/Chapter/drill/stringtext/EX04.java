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
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		String action = input.sval;
		input.nextToken();
		String action1 = input.sval;
		
		
		
		
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
