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
			int temp = 0;
			strTemp = "";
			for(int i=0;i<time;i++)
			{
				if(array[temp]<array[i])
				{
					temp = i;
				}
			}
			for(int i = temp-1;i>=0;i--)
			{ 	
				array[temp]--;
				if(array[i]==array[temp])
				{
					continue;
				}
				else
				{
					array[i]++;
					break;
				}
			}
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
