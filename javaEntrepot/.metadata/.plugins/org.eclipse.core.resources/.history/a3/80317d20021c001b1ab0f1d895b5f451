package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class EX03 {

	public static void main(String[] args)throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	
		st.nextToken();	
		double time = st.nval;
		st.nextToken();
		int length = (int)st.nval;
		
		double[][] array= new double[length][3];
		for(int i=0;i<length;i++)
		{
			st.nextToken();
			array[i][0] = st.nval;
			st.nextToken();
			array[i][1] = st.nval;
			array[i][2] = array[i][0]/ array[i][1];
		}
		for(int i=0;i<length-1;i++)
		{
			for(int l=0;l<length-1;l++)
			{
				if(array[l]<array[l+1])
				{
					double temp = array[l+1];
					array[l+1] = array[l];
					array[l] = temp;
				}
			}
		}
		for(double a:array)
		{
			System.out.println(a);
		}
		
		
	}

}
