package stringtext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX03 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String get = input.readLine().toLowerCase();
		String text = input.readLine().toLowerCase();
		String[] array = text.split(" ");
		
		int min = text.indexOf(" "+get+" ")+1;
		int sum = 0;
		int length = array.length;
		for(int i=0;i<length;i++)
		{
			if(get.equals(array[i]))
			{
				sum++;
			}
		}
		if(sum == 0)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(sum+" "+min);
		}
	}
}
