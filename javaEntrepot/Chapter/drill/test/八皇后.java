package test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class �˻ʺ� {

	public static int[] array1;
	public static int[] array2;
	public static int[] array3;
	public static int sum;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
	
	//����
	public static void getSum(int[] array,int k)
	{
		//��k�������鷶Χʱ�˳�
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
		
		//kλ��ѭ������
		for(int i=1;i<array.length;i++)
		{
			array[k] = i;
			int[] temp = array.clone();
			//������Ϲ���,��һλ
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
		//�ж��Ƿ����ظ���
		int[] tempArr = array.clone();
		Arrays.sort(tempArr);
		for(int i=1;i<size;i++)
		{
			if(tempArr[i-1]==tempArr[i]&&tempArr[i-1]!=0)
			{
				return false;
			}
		}
		//�жϹ���
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
