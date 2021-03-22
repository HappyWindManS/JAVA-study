package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P1003铺地毯 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int size = (int) input.nval;
		int[][] array = new int[size+1][4];
		
		for(int i=1;i<size+1;i++)
		{
			input.nextToken();
			array[i][0] = (int) input.nval;
			input.nextToken();
			array[i][1] = (int) input.nval;
			input.nextToken();
			array[i][2] = (int) input.nval;
			input.nextToken();
			array[i][3] = (int) input.nval;
		}
		input.nextToken();
		int xZ = (int) input.nval;
		input.nextToken();
		int yZ = (int) input.nval;
		
		int temp = size;
		while(temp>-1)
		{
			if(xZ>=array[temp][0]&&yZ>=array[temp][1]&&
					xZ<=array[temp][0]+array[temp][2]&&yZ<=array[temp][1]+array[temp][3])
			{
				break;
			}
			--temp;
		}
		System.out.println(temp);
	}

}
