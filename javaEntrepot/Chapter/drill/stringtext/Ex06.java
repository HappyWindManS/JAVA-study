package stringtext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int getTrue = 0;
		Queue<String> queue = new LinkedList<String>();
		
		String temp;
		while((temp=input.readLine().replace(" ", ""))!="EOF")
		{
			queue.add(temp);
		}
		String str;
		int sum = 0;
		while(!queue.isEmpty())
		{
			str = queue.poll();
			String text = input.readLine().replace(" ", "");
			sum += str.length();
			if(str==text)
			{
				getTrue += str.length();
			}
			else
			{
				char[] char1 = str.toCharArray();
				char[] char2 = text.toCharArray();
				int num = str.length();
				int num1 = text.length();
				for(int i = 0,l = 0;i<num;i++,l++)
				{
					if(char1[i]==char2[l])
					{
						getTrue++;
					}
					else if(char2[l]=='<')
					{
						i--;
						l++;
					}
				}
			}		
		}
		int time = input.read();
		time = getTrue/(time/60);
		System.out.println(time);
	}

}
