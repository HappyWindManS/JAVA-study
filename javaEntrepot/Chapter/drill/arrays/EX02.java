package arrays;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int length= input.nextInt()+1;
		int num = input.nextInt();
		
		int[][] array = new int[num][2];
		for(int i=0;i<num;i++)
		{
			array[i][0] = input.nextInt();
			array[i][1] = input.nextInt();
		}
		
		for(int i=0;i<num;i++)
		{
			for(int l=0;l<num;l++)
			{
				if(array[i][0]<array[l][1]&&array[i][0]>array[l][0]&&array[i][1]>array[l][1])
				{
					array[l][1] = array[i][1];
					array[i][0] = 0;
					array[i][1] = 0;
				}
				else if(array[i][0]<array[l][1]&&array[i][0]>array[l][0]&&array[i][1]<array[l][0])
				{
					array[i][0] = 0;
					array[i][1] = 0;
				}
				else if(array[i][0]==array[l][1]&&array[i][1]>array[l][1])
				{
					array[l][1] = array[i][1];
					array[i][0] = 0;
					array[i][1] = 0;
				}
			}
		}
		for(int i=0;i<num;i++)
		{
			if(array[i][1]!=0)
			{
				System.out.printf(array[i][0]+"+"+array[i][1]+"\n");
			}
		}
		for(int i=0;i<num;i++)
		{
			if(array[i][1]!=0)
			length -= array[i][1] - array[i][0] +1;
		}
		
		System.out.println(length);
	}

}