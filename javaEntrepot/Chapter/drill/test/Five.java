package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Five {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int size = (int) input.nval;
		input.nextToken();
		double time = input.nval;
		
		double[] array = new double[size];
		for(int i=0;i<size;i++)
		{
			input.nextToken();
			array[i] = input.nval;
		}
		
		boolean bool = true;
		int dw = 2;
		int rigth = 0;		
		int temp = 0;
		while(bool)
		{			
			if(array[temp]<time)
			{
				temp += size/dw;
			}
			if(array[temp]>time)
			{
				temp -= size/dw;
			}
			if(array[temp]==time)
			{
				bool = false;
			}
			if(dw>size)
			{
				temp++;
				bool = false;
			}
			dw *= 2;
		}
		
		System.out.println(temp);
	}

}
