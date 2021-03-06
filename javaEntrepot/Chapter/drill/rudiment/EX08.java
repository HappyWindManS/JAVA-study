package rudiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class EX08 {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int num = (int) input.nval;
		StringBuilder stringBuffer = new StringBuilder();
		while(num%10==0)
		{
			num /= 10;
		}
		if(num<0)
		{
			stringBuffer.append(Math.abs(num));
			stringBuffer.append("-");			
		}
		else
		{
			stringBuffer.append(num);
		}
		System.out.println(stringBuffer.reverse().toString());
	}
}
