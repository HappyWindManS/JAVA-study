package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class There {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		double left = input.nval;
		input.nextToken();
		double rigth = input.nval;
		input.nextToken();
		double median = input.nval;
		
		if(rigth>=left)
		{
			double temp = rigth;
			rigth = left;
			left = temp;
		}
		if(rigth>=median)
		{
			double temp = median;
			median = rigth;
			rigth = temp;
		}
		if(median<left)
		{
			double temp = median;
			median = left;
			left = temp;
		}
		System.out.println((int)left+" "+(int)median+" "+(int)rigth);
	}

}
