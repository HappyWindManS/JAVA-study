package test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Eight {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int time = (int) input.nval;
		String[] array = new String[time];
		for(int i=0;i<time;i++)
		{
			input.nextToken();
			array[i] = input.sval;
		}
		
		Arrays.sort(array,new Comparator<String>(){
			
			public int compare(String s1, String s2) {
				int l1 = s1.length();
				int l2 = s2.length();
				if(l1>l2)
				{
				for(int i=0;i<l1;)
				{
					for(int l=0;l<l2;i++,l++)
					{
						int temp = s1.charAt(i) - s2.charAt(l);
						if(temp == 0)
						{
							continue;
						}
						else
						{
							return temp;
						}
						}
					}				
				
				}
			else
			{
				for(int l=0;l<l2;)
				{
					for(int i=0;i<l1;i++,l++)
					{
						int temp = s1.charAt(i) - s2.charAt(l);
						if(temp == 0)
						{
							continue;
						}
						else
						{
							return temp;
						}
						}
					}			
			}
				return 0;
			}}
		);
		
		System.out.print(Integer.parseInt(array[0]));
		for(int i=1;i<time;i++)
		{
			System.out.print(array[i]);
		}
	}
	

}
