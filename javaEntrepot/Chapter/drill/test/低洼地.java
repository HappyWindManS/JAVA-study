package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class 低洼地 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		double num1 = input.nval;
		int sum = 0;
		input.nextToken();
		double temp = input.nval;
		boolean xp = false;
		for(int i=0;i<num1-1;i++)
		{
			input.nextToken();
			double temp1 = input.nval;
			if(temp-temp1<0&&xp==true)
			{
				temp = temp1;
				sum++;
				xp=false;
			}
			else if(temp-temp1>0)
			{
				temp = temp1;
				xp=true;
			}
			else
			{
				temp = temp1;
			}
		}
		System.out.println(sum);
	}

}
