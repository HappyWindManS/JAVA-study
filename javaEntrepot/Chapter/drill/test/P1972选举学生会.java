package test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class P1972选举学生会 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter((new BufferedOutputStream(System.out))));
		input.nextToken();
		int size = (int) input.nval+1;
		input.nextToken();
		int num = (int) input.nval;
		int[] array = new int[size];
		for(int i =0;i<num;i++)
		{
			input.nextToken();
			array[(int)input.nval]++;
		}
		for(int i=0;i<size;i++)
		{
			for(int l=0;l<array[i];l++)
			{
				out.append(i+" ");
			}
		}
		out.flush();
		out.close();
	}

}
