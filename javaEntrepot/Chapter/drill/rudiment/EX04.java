package rudiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class EX04 {

	public static void main(String[] args)throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		int[] array = new int[7];
		int num = 0;
		for(int i=0;i<7;i++)
		{
			st.nextToken();
			array[i]+=st.nval;
			st.nextToken();
			array[i]+=st.nval;
			if(array[i]>8&&array[i]>array[num])
			{
				num = i;
			}
		}
		System.out.println(num+1);
	}
}
