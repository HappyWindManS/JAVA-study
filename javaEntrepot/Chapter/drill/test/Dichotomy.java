package test;

import java.io.*;
import java.util.HashMap;


public class Dichotomy {

	public static double[] array;
	public static HashMap<Double,Integer> hs = new HashMap<Double,Integer>();
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int size = (int) (input.nval +1);
		input.nextToken();
		double temp = input.nval;
		array = new double[size];
		for(int i=1;i<size;i++)
		{
			input.nextToken();
			array[i] = input.nval;
		}
		for(int i=0;i<temp-1;i++)
		{
			input.nextToken();
			System.out.print(getNum(input.nval,0,size,0)+" ");
		}
		input.nextToken();
		System.out.print(getNum(input.nval,0,size,0));
	}
	
	public static int getNum(double get,int left,int rigth,int temp)
	{
		if(hs.containsKey(get))
		{
			return hs.get(get);
		}
		temp = (left+rigth)/2;
		if(left==temp)
		{
			return -1;
		}
		if(array[temp] == get)
		{
			while(get == array[temp]&&temp!=0)
			{
				temp--;
			}
			hs.put(array[temp], temp);
			return temp+1;	
		}
		else if(array[temp] < get)
		{
			return getNum(get,temp,rigth,0);
		}
		else
		{
			return getNum(get,left,temp,0);
		}
	}

}
