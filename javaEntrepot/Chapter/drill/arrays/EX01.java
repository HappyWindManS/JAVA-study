package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class EX01 {

	public static void main(String[] args)throws IOException{
		// TODO 自动生成的方法存根
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		double[] array = new double[10];
		for(int i=0;i<10;i++)
		{		
			st.nextToken();
			array[i] = st.nval;
		}
		
		st.nextToken();
		double num = st.nval + 30;
		int time = 0;
		for(int i=0;i<10;i++)
		{
			time += array[i]<=num?1:0;
		}
		System.out.print(time);
	}
}
