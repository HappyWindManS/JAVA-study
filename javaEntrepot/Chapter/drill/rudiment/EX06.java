package rudiment;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		Scanner st = new Scanner(System.in);
		String num = st.next();
		System.out.println(num);
		int time = (int)st.nextInt();
		
		int sum =0;
		int getNum = num.length();
		for(int i=1,temp = 0,multiple=1;i<getNum+1;i++)
		{
			sum = 1+temp+(multiple-1)*i;
			multiple=multiple*10;
			temp++;
		}
		System.out.println(sum);
	}
}
