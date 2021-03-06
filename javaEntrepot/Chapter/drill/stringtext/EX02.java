package stringtext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class EX02 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		hash.put('0', 0);
		hash.put('1', 1);
		hash.put('2', 2);
		hash.put('3', 3);
		hash.put('4', 4);
		hash.put('5', 5);
		hash.put('6', 6);
		hash.put('7', 7);
		hash.put('8', 8);
		hash.put('9', 9);
		hash.put('X', 10);
		hash.put('-', -1);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String text = input.readLine();	
		char[] set = text.toCharArray();
		
		int length = set.length;
		int bool = 0;
		for(int i=0,l=1;i<length-2;i++,l++)
		{
			if(hash.get(set[i])==-1)
			{
				l--;
				continue;
			}
			bool += hash.get(set[i])*l;
		}
		bool %= 11;
		if(bool == hash.get(set[length-1]))
		{
			System.out.println("Right");
		}
		else {
			for(int i=0;i<length-1;i++)
			{
				System.out.print(set[i]);
			}
			if(bool != 10)
			{
				System.out.print(bool);
			}
			else{
				System.out.print("X");
			}
		}

	}
}
