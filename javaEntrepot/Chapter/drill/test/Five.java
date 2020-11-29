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
		long time = (long) input.nval;
		
		for(int i=0;i<size;i++)
		{
			input.nextToken();
			long temp = (long) input.nval;
			if(time == temp)
			{
				System.out.println(i);
				break;
			}
			if(time<temp)
			{
				System.out.println(i);
				break;
			}
			if(i==size-1)
			{
				if(time<temp)
				{
					System.out.println(0);
					break;
				}
				System.out.println(i);	
				break;
			}
		}		
	}

}
