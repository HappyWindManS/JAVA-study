package rudiment;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		int n=sin.nextInt(),x=sin.nextInt();
		int ss=0;
		int xx=0;
		int j;
		for(int i=1;i<=n;i++)
		{
			j=i;
			while(j!=0){
				ss=j%10;
				if(ss==x)
				{
					xx++;
				}
				j=j/10;
			}
		}
		System.out.print(xx);
	}
}


