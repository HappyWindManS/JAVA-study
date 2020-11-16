package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class EX04_2 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int size = (int) input.nval;
		
		int[] arrayGetNum = new int[size];
		boolean[] array = new boolean[10001];
		for(int i=0;i<size;i++)
		{
			input.nextToken();
			int temp =(int) input.nval;
			arrayGetNum[i]= temp;
			array[temp]=true;
		}
		int sum = 0;
		for(int i=0;i<size;i++)
		{
			for(int l=0;l<size-1;l++)
			{
				if(arrayGetNum[i]<arrayGetNum[l])
				{
					continue;
				}
				int temp = arrayGetNum[i]-arrayGetNum[l];
				if(array[temp]&&temp!=arrayGetNum[l])
				{
					sum++;
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
