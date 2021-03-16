package one;

import java.io.*;
import java.util.Arrays;
public class 数组排序 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter((new BufferedOutputStream(System.out))));
		
		input.nextToken();
		int size = (int) input.nval;
		int[] array = new int[size];
		for(int i=0;i<size;i++)
		{
			input.nextToken();
			array[i] = (int) input.nval;
		}
		Arrays.sort(array);
		for(int i=0;i<size-1;i++)
		{
			output.append(array[i]+" ");
		}
		output.append(array[size-1]+"");
		output.flush();
		output.close();
	}

}
