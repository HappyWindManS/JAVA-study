package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class EX02 {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		double length= (int) (input.nval+1);
		input.nextToken();
		int num = (int)input.nval;
	
		double[][] array = new double[num][2];
		for(int i=0;i<num;i++)
		{
			input.nextToken();
			array[i][0] = input.nval;
			input.nextToken();
			array[i][1] = input.nval;
		}
		for(int i=0;i<num;i++)
		{
			for(int l=0;l<num;l++)
			{
				if(array[i][0]<array[l][1]&&array[i][0]>array[l][0]&&array[i][1]>array[l][1]||array[i][0]==array[l][1]&&array[i][1]>array[l][1])
				{
					array[l][1] = array[i][1];
					array[i][0] = 0;
					array[i][1] = 0;
				}
				else if(array[i][0]<array[l][1]&&array[i][0]>array[l][0]&&array[i][1]<array[l][0]||array[i][0]<array[l][1]&&array[i][1]<array[l][1]&&array[i][0]>array[l][0])
				{
					array[i][0] = 0;
					array[i][1] = 0;
				}
			}
		}
		for(int i=0;i<num;i++)
		{
			if(array[i][1]!=0)
			length -= array[i][1] - array[i][0] +1;
		}
		
		System.out.println((int)length);
	}

}