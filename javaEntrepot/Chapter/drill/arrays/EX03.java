package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;
import java.util.Stack;

public class EX03 {

	public static void main(String[] args) throws IOException{
		// TODO �Զ����ɵķ������
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		Stack<Integer> array = new Stack<Integer>(); 
		for(;;)
		{
			st.nextToken();
			int temp = (int) st.nval;
			if(temp == 0)
			{
				break;
			}
			array.push(temp);
		}
		while(!array.empty())
		{
			System.out.print(array.pop()+" ");
		}
	}
}
