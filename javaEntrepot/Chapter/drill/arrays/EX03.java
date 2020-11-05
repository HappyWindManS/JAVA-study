package arrays;

import java.io.*;
import java.util.Stack;

public class EX03 {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
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

