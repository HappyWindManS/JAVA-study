package test;

import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		input.next();
		String row1 = input.next();
		String row2 = input.next();

		if(row1.charAt(1)=='#'&&row1.charAt(2)=='#')
		{
			if(row2.charAt(1)=='#')
			{
				System.out.println(4);
			}
			else 
			{
				System.out.println(6);
			}
		}
		else if(row1.charAt(5)=='#')
		{
			if(row1.charAt(1)=='#')
			{
				System.out.println(5);
			}
			else if(row2.charAt(4)=='#')
			{
				System.out.println(2);
			}else
			{
				System.out.println(3);
			}
		}
		else
		{
			System.out.println(1);
		}
	}

}
