package rudiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class EX05 {

	public static void main(String[] args)throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		double num = st.nval;
		double temp = 1;
		double sum = 0;
		do
		{
			sum += 1.0/temp;
			temp++;
		}while(sum<num);
		System.out.print((int)temp-1);
	}
}
