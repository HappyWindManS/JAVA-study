package recurrence;

import java.util.Scanner;

public class Ex02 {

	public static int sum = 0;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int size = input.nextInt();
		int[][] temp = new int[num][2];
		int[] array = new int[size];
		
		for(int i=0;i<num;i++)
		{
			temp[i][0] = input.nextInt();
		}
		input.close();
		dfs(array,temp,0,0);
		System.out.println(sum);
	}
	
	public static void dfs(int[] array,int[][] temp,int pointer,int i)
	{
		if(pointer == array.length)
		{
			int num = 0;
			for(int i1 =0;i1<array.length;i1++)
			{
				num+= array[i1];
			}
			if(s(num))
			{
				sum++;
			}
			return;
		}
		for(;i<temp.length;i++)
		{
			if(temp.length - pointer >= array.length-1)
			{
				if(temp[i][1]!=1)
				{
					array[pointer] = temp[i][0];
					temp[i][1] = 1;
					dfs(array,temp,pointer+1,i);
					temp[i][1] = 0;
				}
			}
		}
	}
	
	public static boolean s(int num)
	{
		for(int i=2;i<Math.sqrt(num)+1;i++)
		{
			if(num%i==0&&i!=num)
			{
				return false;
			}
		}
		return true;
	}

}
