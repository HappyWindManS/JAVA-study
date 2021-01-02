package recurrence;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {

	public static HashMap<String,Long> hs = new HashMap<String,Long>();
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		long c = input.nextLong();
		
		System.out.println();
		while(!(a==-1&&b==-1&&c==-1))
		{
			System.out.println("w("+a+", "+b+", "+c+") = "+get(a,b,c));
			a = input.nextLong();
			b = input.nextLong();
			c = input.nextLong();
		}
	}
	
	public static long get(long a,long b,long c)
	{
		if(a<=0||b<=0||c<=0)
		{
			return 1;
		}
		if(a>20||b>20||c>20)
		{
			return get(20,20,20);
		}
		if(hs.containsKey(a+"-"+b+"-"+c))
		{
			return hs.get(a+"-"+b+"-"+c);
		}
		if(a<b&&b<c)
		{
			hs.put(a+"-"+b+"-"+c, get(a,b,c-1)+get(a,b-1,c-1)-get(a,b-1,c));
		}
		else 
		{
			hs.put(a+"-"+b+"-"+c,get(a-1,b,c)+get(a-1,b-1,c)+get(a-1,b,c-1)-get(a-1,b-1,c-1));
		}
		return hs.get(a+"-"+b+"-"+c);
	}
}
