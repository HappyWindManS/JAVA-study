package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class Seven {

	@SuppressWarnings("unchecked")
	public static void main(String[] args)  {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		String[] array = new String[size];
		
		for(int i=0;i<size;i++)
		{
			array[i] = input.next();
		}
		Arrays.sort(array,new Comparator<String>(){

			@Override
			public int compare(String text1, String text2) {
				// TODO 自动生成的方法存根
				char[] array1=text1.toCharArray();
				char[] array2=text2.toCharArray();
				for(int i=0,l=0;i<array1.length;i++,l++)
				{
					if(l==array2.length)
					{
						l = 0;
					}
					if(array1[i]-array2[l]==0)
					{
						continue;						
					}
					else
					{
						return array1[i]-array2[l];
					}
				}
				return 0;
			}	
		});
		
		System.out.print(Integer.parseInt(array[0]));
		for(int i=1;i<size;i++)
		{
			System.out.print(array[i]);
		}
		
	}

}
