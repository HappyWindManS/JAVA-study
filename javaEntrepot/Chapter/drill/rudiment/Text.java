package rudiment;

import java.io.*;

public class Text {

	public static void main(String[] args)throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		double num = st.nval;
		double sum =0;
		double time = 0;		
		for(int i=0;i<num;i++)
		{
			st.nextToken();
			sum += st.nval;
		}
		for(int i=0;i<num;i++)
		{
			st.nextToken();
			time += st.nval;
		}
		System.out.print(String.format("%.6f",(sum*3-time*2)/(sum-time)));
	}
}
