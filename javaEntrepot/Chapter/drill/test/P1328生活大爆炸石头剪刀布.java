package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P1328生活大爆炸石头剪刀布 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int time = (int) input.nval;
		input.nextToken();
		int jTime = (int) input.nval;
		input.nextToken();
		int yTime = (int) input.nval;
		int[] jarray = new int[jTime];
		int[] yarray = new int[yTime];
		
		for(int i=0;i<jTime;i++)
		{
			input.nextToken();
			jarray[i] = (int) input.nval;
		}
		for(int i=0;i<yTime;i++)
		{
			input.nextToken();
			yarray[i] = (int) input.nval;
		}
		
		int p1 = 0;
		int p2 = 0;
		
		int price1 = 0;
		int price2 = 0;
		while(time>0)
		{
			if(p1==jTime)
			{
				p1=0;
			}
			if(p2==yTime)
			{
				p2=0;
			}
			int temp = getPrice(jarray[p1],yarray[p2]);
			if(temp == -3)
			{
				temp = getPrice(yarray[p2],jarray[p1]);
				if(temp==0)
				{
				}
				else if(temp==1)
				{
					price2++;					
				}
				else
				{
					price1++;
				}		
			}
			else{
				if(temp==0)
				{
				}
				else if(temp==1)
				{
					price1++;					
				}
				else
				{
					price2++;
				}
			}	
			time--;
			p1++;
			p2++;
		}
		System.out.println(price1+" "+price2);
	}
	
	public static int getPrice(int jc,int yc)
	{
		if(jc==yc)
		{
			return 0;
		}
		if(jc==0&&(yc==1||yc==4))
		{
			return -1;
		}
		if(jc==0&&(yc==2||yc==3))
		{
			return 1;
		}
		if(jc==1&&(yc==2||yc==4))
		{
			return -1;
		}
		if(jc==1&&yc==3)
		{
			return 1;
		}
		if(jc==2&&yc==3)
		{
			return -1;
		}
		if(jc==2&&yc==4)
		{
			return 1;
		}
		if(jc==3&&yc==4)
		{
			return 1;
		}
		return -3;
	}

}
