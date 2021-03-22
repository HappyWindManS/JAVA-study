package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P1563h玩具谜题 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int numberOfPeople = (int) input.nval;
		input.nextToken();
		int numberOfTime = (int) input.nval;
		People[] array = new People[numberOfPeople];
		
		for(int i=0;i<numberOfPeople;i++)
		{
			array[i] = new People();
			input.nextToken();
			array[i].direction = (int) input.nval;
			input.nextToken();
			array[i].name = input.sval;
		}
		long num = 0;
		for(int i=0;i<numberOfTime;i++)
		{
			input.nextToken();
			long temp = (int)input.nval;
			input.nextToken();
			long dir = (int)input.nval;
			
			if(dire(temp,array[(int) num].direction)==1)
			{
				num += dir;
			}
			else
			{
				num -= dir;
			}
			
			if(num>numberOfPeople-1)
			{
				num = num % (numberOfPeople -1);
			}
			if(num<0)
			{
				num = numberOfPeople - (0 -(num % numberOfPeople));
			}
		}
		
		System.out.println(array[(int) num].name);
	}
	
	public static int dire(long temp,long direction)
	{
		return (int) (temp^direction);
	}

}

class People
{
	long direction;
	String name;
}
