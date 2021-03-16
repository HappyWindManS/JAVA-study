package test;

import java.io.*;
import java.util.Arrays;

public class 快速排序 {
	
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter((new BufferedOutputStream(System.out))));
		
		input.nextToken();
		int size = (int) input.nval;
		int[] array = new int[size];
		
		for(int i=0;i<size;i++)
		{
			input.nextToken();
			array[i] = (int) input.nval;
		}
		//function(array,0,size-1);
		Arrays.sort(array);
		for(int i=0;i<size-1;i++)
		{
			out.append(array[i]+" ");
		}
		out.append(array[size-1]+"");
		out.flush();
		out.close();
	}
	
	public static void function(int[] array,int left,int right)
	{
		int L = left;
		int R = right;
		if(left>=right)
		{
			return;
		}
		int temp = array[left];
		while(left<right)
		{
			while(right>left&&array[right]>=temp)
			{
				right--;
			}
			array[left] = array[right];
			while(left<right&&array[left]<=temp)
			{
				left++;
			}
			array[right] = array[left];
			if(left>=right)
			{
				array[left] = temp;
			}
		}
		function(array,L,right-1);
		function(array,right+1,R);
	}

}
