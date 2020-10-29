package rudiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class EX06 {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		String num = st.sval;
		st.nextToken();
		int time = (int)st.nval;
		
		int getNum = num.length();
		
		for(int i=0;i<getNum;i++)
		{
			
		}
	}
}
