package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;

public class EX05 {

	final public static StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		
		final double row = nextInt();
		final double column = nextInt()*1000;
		
		HashMap<Double, Integer> hash = new HashMap<Double, Integer>();
		final int size = (int) (nextInt()+1);
		int[] array = new int[size];
		for(int i=0;i<row;i++)
		{
			for(int l=1000;l<column+1;l+=1000)
			{
			    double getTime =  nextInt();
				double num = l+getTime;
				if(!hash.containsKey(num))
				{
					array[(int)getTime]++;
					hash.put(num, 1);
				}
			}
		}
		
		for(int i=1;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static double nextInt()
	{
		try {
			input.nextToken();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return input.nval;
	}

}
