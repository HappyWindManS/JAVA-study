package test;

import java.io.*;
import java.util.Scanner;

public class P2615幻方 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根	
		Scanner input = new Scanner(System.in);
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter((new BufferedOutputStream(System.out))));
		
		int size = input.nextInt();
		
		int[][] array = new int[size][size];
		int[] temp = new int[2];
		
		temp[0] = 0;
		temp[1] = size/2;
		int le = size*size;
		array[temp[0]][temp[1]] = 1;
		
		for(int i=2;i<le+1;i++)
		{
			if(temp[0]==0&&temp[1]!=size-1)
			{
				array[size-1][temp[1]+1] = i;
				temp[0] = size-1;
				temp[1]++;
				continue;
			}
			if(temp[0]!=0&&temp[1]==size-1)
			{
				array[temp[0]-1][0] = i;
				temp[0]--;
				temp[1] = 0;
				continue;
			}
			if(temp[0]==0&&temp[1]==size-1)
			{
				array[temp[0]+1][temp[1]] = i;
				temp[0]++;
				continue;
			}
			if(temp[0]!=0&&temp[1]!=size-1)
			{
				if(array[temp[0]-1][temp[1]+1]==0)
				{
					array[temp[0]-1][temp[1]+1]=i;
					temp[0]--;
					temp[1]++;
					continue;
				}
				else
				{
					array[temp[0]+1][temp[1]]=i;
					temp[0]++;
					continue;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			for(int l=0;l<size;l++)
			{		
				out.append(array[i][l]+" ");
			}
			out.flush();
			System.out.println();
		}
	}

}
