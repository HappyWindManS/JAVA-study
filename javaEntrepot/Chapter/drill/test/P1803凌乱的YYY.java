package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P1803凌乱的YYY {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int time = (int) input.nval;
		
		int[] array = new int[1000000];
		
		//标明上限
		int max = 0;
		//计数器
		int sum = 0;

		for(int i=0;i<time;i++)
		{
			input.nextToken();
			int temp = (int) input.nval;
			input.nextToken();
			int tempGet = (int) input.nval;
			max = Math.max(max, temp);
			if(array[temp]==0)
			{
				array[temp] = tempGet;	
			}
			else
			{
				if(array[temp]>tempGet)
				{
					array[temp] = tempGet;
				}			
			}
		}

		for(int i=0;i<max;i++)
		{
			if(array[i]>0)
			{
				for(int l=i;l<array[i];l++)
				{
					if(array[l]!=0&&array[l]<array[i])
					{
						array[i] = 0;
					}
				}
			}
		}
		
		int temp = 0;
		while(temp<=max)
		{
			if(array[temp]!=0)
			{
				temp = array[temp];
				sum++;
			}
			else
			{
				temp++;
			}
		}	
	
		System.out.println(sum);
	}

}