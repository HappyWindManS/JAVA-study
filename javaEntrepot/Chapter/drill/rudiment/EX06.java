package rudiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class EX06 {

	public static void main(String[] args)throws IOException{
		// TODO 自动生成的方法存根
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		String num = st.sval;
		st.nextToken();
		int time = (int)st.nval;
		
		
		int sum =0;
		int getNum = num.length();
		int temp = Integer.parseInt(num.substring(0,1));
		if(temp>time)
		{
			sum += Math.pow(10, getNum-1)+temp*Math.pow(10, getNum-2);
		}
		else
		{
			sum += temp*Math.pow(10, getNum-2);
		}
		temp = Integer.parseInt(num.substring(getNum-2,1));
		if(temp>time)
		{
			sum += 1;
		}
		String over = num.substring(1,getNum-2);
		int one = over.length();
		for(int i=0;i<one-2;i++)
		{
			if(Integer.parseInt((over.substring(i,1)))>time)
			{
				sum += Math.pow(10, one-1);
			}
		}
		System.out.println(sum);
	}
	

}
