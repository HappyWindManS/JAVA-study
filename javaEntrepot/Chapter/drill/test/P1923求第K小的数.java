package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class P1923���KС���� {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int size = (int) input.nval;
		double[] array = new double[size];
		input.nextToken();
		int time = (int) input.nval;
		
		for(int i=0;i<size;i++)
		{
			input.nextToken();
			array[i] = input.nval;
		}
		
		Arrays.sort(array);
		System.out.println((int)array[time]);
	}

}
