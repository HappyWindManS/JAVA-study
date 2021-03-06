package arithmetic1025;

import java.util.Scanner;
import java.util.Stack;

public class KuoHao {

	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		String str = input.next();	
		System.out.println(isBool(str));
	}
	
	static boolean isBool(String text)
	{
		char[] getArr = text.toCharArray();
		int time = text.length()-1;
		Stack temp = new Stack();
		for(int i=0;i<time;i++)
		{
			char ch = getArr[i];
			if(temp.empty())
			{
				temp.push(ch);
				System.out.println(ch);
			}
			else if(getNum((char) temp.peek())+getNum(getArr[i]) == 0)
			{
				temp.pop();
			}
			else
			{
				temp.push(getArr[i]);
			}
		}
		
		return temp.empty()?true:false;
	}
	
	static int getNum(char ch)
	{
		switch(ch)
		{
			case '(':
				return -1;
			case ')':
				return 1;
			case '[':
				return -2;
			case ']':
				return 2;
			case '{':
				return -3;
			case '}':
				return 3;
			default :
				return -5;
		}
	}
}
