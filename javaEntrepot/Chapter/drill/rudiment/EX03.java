package rudiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class EX03 {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		int surplus = 0;
		int deposit = 0;
		for(int i=1;i<13;i++)
		{
			st.nextToken();
			surplus = 300+surplus-(int)st.nval;
			if(surplus<0)
			{
				System.out.println(-i);
				System.exit(0);
				break;
			}
			else 
			{
				deposit += surplus /100;
				surplus = surplus%100;
			}
		}
		int ret = (int) (deposit * 100 +deposit * 100*0.2+surplus);
		System.out.print(ret);
	}
}
