package recurrence;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {

	public static HashMap<Integer,Integer> hs= new HashMap<Integer,Integer>();
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int count = input.nextInt()+1;
		int time = input.nextInt();
		long[] array = new long[count];
		array[1] = 1;
		array[2] = 2;
		
		for(int i=3;i<count;i++)
		{
			int temp = 0;
			if(i-time<1)
			{
				for(int l=1;l<i;l++)
				{
					temp +=array[l];
				}
			}
			else {
				for(int l=i-time;l<i;l++)
				{
					temp +=array[l];
				}
			}
			array[i] = temp%100003;
		}
		if(time == 1)
		{
			array[count-1] = 1;
		}
		System.out.println(array[count-1]);
	}

}
