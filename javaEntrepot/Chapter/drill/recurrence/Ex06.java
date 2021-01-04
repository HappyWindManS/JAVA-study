package recurrence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ex06 {

	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		int time = input.nextInt();
		HashSet<String> hs = new HashSet<String>();
		int[] array = new int[time];
		int num = time-1;
		//先初始化对照组
		for(int i=0;i<time;i++)
		{
			array[i] = 1;
			if(i==num)
			{
				array[num] = value;
				for(int l=0;l<num;l++)
				{
					array[num] -= array[l];
				}
			}
		}
		Arrays.sort(array);	
		String strTemp = "";
		for(int i =0;i<time;i++)
		{
			strTemp += array[i]+",";
		}
		hs.add(strTemp);
		
		for(int l=0;;l++)
		{
			//初始化变量
			int temp = 0;
			strTemp = "";
			//获取最大值与最小值的下标
			for(int i=0;i<time;i++)
			{
				if(array[temp]<array[i])
				{
					temp = i;
				}
			}
			if(temp==0)
			{
				break;
			}
			//对数组进行操作
			for(int i = temp-1;i>=0;i--)
			{ 	
				if(array[i]==array[temp]-1)
				{
					continue;
				}
				else
				{
					array[temp]--;
					array[i]++;
					break;
				}
			}
			//对数组顺序重置，存入hash表
			Arrays.sort(array);			
			for(int i =0;i<time;i++)
			{
				strTemp += array[i]+",";
			}
			if(!hs.contains(strTemp))
			{
				hs.add(strTemp);
			}
			else
			{
				break;
			}
		}	
		System.out.println(hs.size());
	}

}
