package rudiment;

import java.io.*;


public class EX02 {

	public static void main(String[] args)throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		int time = (int) st.nval;
		st.nextToken();
		int amount1 = (int) st.nval;
		st.nextToken();
		int price1 = (int) st.nval;
		st.nextToken();
		int amount2 = (int) st.nval;
		st.nextToken();
		int price2 = (int) st.nval;
		st.nextToken();
		int amount3 = (int) st.nval;
		st.nextToken();
		int price3 = (int) st.nval;
		
		int need1 = (time%amount1==0?time/amount1:time/amount1+1) * price1;
		int need2 = (time%amount2==0?time/amount2:time/amount2+1) * price2;
		int need3 = (time%amount3==0?time/amount3:time/amount3+1) * price3;

		System.out.println(need1<need2?Math.min(need1, need3):Math.min(need2, need3));
	}
}
