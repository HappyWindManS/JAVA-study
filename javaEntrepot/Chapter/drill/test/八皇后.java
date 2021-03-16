package test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class 八皇后 {

	public static int[] array1;
	public static int[] array2;
	public static int[] array3;
	public static int sum;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] array = new int[size+1];
		array1 = new int[size+1];
		array2 = new int[size+1];
		array3 = new int[size+1];
		getSum(array,1);

		for(int i=1;i<size;i++)
		{
			System.out.print(array1[i]+" ");
		}
		System.out.print(array1[size]);
		System.out.println();
		
		
		for(int i=1;i<size;i++)
		{
			System.out.print(array2[i]+" ");
		}
		System.out.print(array2[size]);
		System.out.println();
		
		for(int i=1;i<size;i++)
		{
			System.out.print(array3[i]+" ");
		}
		System.out.print(array3[size]);
		System.out.println();
		
		System.out.println(sum);
		
	}
	
	//回溯
	public static void getSum(int[] array,int k)
	{
		//当k超出数组范围时退出
		if(k==array.length)
		{
			if(rule(array))
			{
				sum++;
				if(sum==1)
				{
					array1 = array.clone();
				}
				if(sum==2)
				{
					array2 = array.clone();
				}
				if(sum==3)
				{
					array3 = array.clone();
				}
			}
			return;
		}
		
		//k位数循环测试
		for(int i=1;i<array.length;i++)
		{
			array[k] = i;
			int[] temp = array.clone();
			//如果符合规则,进一位
			if(rule(array))
			{
				getSum(array,k+1);
				array = temp.clone();
			}		
		}
	}

	
	public static boolean rule(int[] array)
	{
		int size = array.length;
		//判断是否有重复数
		int[] tempArr = array.clone();
		Arrays.sort(tempArr);
		for(int i=1;i<size;i++)
		{
			if(tempArr[i-1]==tempArr[i]&&tempArr[i-1]!=0)
			{
				return false;
			}
		}
		//判断规则
		for(int i=1;i<size-1;i++)
		{
			if(array[i]!=0)
			{
				int temp = array[i];
				int addition = i+temp;
				int subtraction = i-temp; 
				for(int l=i+1;l<size;l++)
				{
					if(array[l]!=0&&(subtraction==l-array[l]||addition==l+array[l]))					
					{
						return false;
					}
				}
			}
		}
		return true;
	}
}
