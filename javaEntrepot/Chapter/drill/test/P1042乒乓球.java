package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P1042乒乓球 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		StringBuffer stb = new StringBuffer();
		while(stb.indexOf("E")==-1)
		{
			input.nextToken();
			stb.append(input.sval);
		}
		char temp = 'a';
		int left = 0;
		int right = 0;
		int p = 0;
		while(temp!='E')
		{
			if(temp=='W')
			{
				left++;
			}
			if(temp=='L')
			{
				right++;
			}
			if((left>=11||right>=11)&&Math.abs(left-right)>=2)
			{
				System.out.println(left+":"+right);
				left = 0;
				right = 0;
			}
			temp = stb.charAt(p);
			p++;
		}
		
			System.out.println(left+":"+right);			
		
		
		p = 0;
		temp = 'a';
		left = 0;
		right = 0;
		System.out.println();
		while(temp!='E')
		{	
			if(temp=='W')
			{
				left++;
			}
			if(temp=='L')
			{
				right++;
			}
			if((left>=21||right>=21)&&Math.abs(left-right)>=2)
			{
				System.out.println(left+":"+right);
				left = 0;
				right = 0;
			}
			temp = stb.charAt(p);
			p++;
		}

		
			System.out.println(left+":"+right);
			left = 0;
			right = 0;
		
	}

}
