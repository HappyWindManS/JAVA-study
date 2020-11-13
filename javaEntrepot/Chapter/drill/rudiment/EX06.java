package rudiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
	    double time = input.nval;
	    input.nextToken();
		char text =  (char) input.nval;
		
		int sum = 0;
		for(int i=0;i<time;i++)
		{
			sum += getTime(String.valueOf(i),text);
		}
		
		System.out.println(sum);
	}
	
	public static int getTime(String text,char ch)
	{
		int time = 0;
		char[] charArray = text.toCharArray();
		for(char c:charArray)
		{
			if(c == ch)
			{
				time++;
			}
		}
		return time;
	}
}
