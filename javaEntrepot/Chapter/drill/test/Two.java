package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Two {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		long time = (long) input.nval;
		long sum = 0;
		if(time%2==0)
		{
			sum = (time+1)*(time/2);
		}
		else 
		{
			long temp = time-1;
			sum = (temp+1)*(temp/2)+time;
		}
		System.out.println(sum);
		
	}

}
