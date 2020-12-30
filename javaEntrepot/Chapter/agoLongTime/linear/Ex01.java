package linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int time = (int) input.nval;
		double[][] array = new double[time][];
		for(int i=0;i<time;i++)
		{
			array[i] = new double[i+1];
			for(int l=0;l<=i;l++)
			{
				input.nextToken();
				array[i][l] = input.nval;
			}
		}
		for(int i=time-2;i>=0;i--)
		{
			for(int l=0;l<=i;l++)
			{
				int max = 0;
				max = (int) Math.max(array[i+1][l],array[i+1][l+1]);
				array[i][l] = max + array[i][l];
			}
		}
		System.out.println(((int)array[0][0]));
	}


}
