package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Four {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int size = (int) input.nval;
		input.nextToken();
		int time = (int) input.nval;
		double[] array = new double[size];
		for(int i = 0;i<size;i++)
		{
			input.nextToken();
			array[i] = input.nval;
		}
		Arrays.sort(array);
		
		for(int i=size-time;i<size-1;i++)
		{
			System.out.print((int)array[i]+" ");
		}
		System.out.print((int)array[size-1]);
	}

}
