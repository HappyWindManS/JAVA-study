package one;

import java.util.Scanner;

public class ʮ������ת�˽��� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		String[] array = new String[time]; 
		for(int i=0;i<time;i++)
		{
			array[i] = input.next();
		}
		for(int i=0;i<time;i++)
		{
			String temp = array[i];
			int num = Integer.parseInt(temp,16);
			System.out.println(Integer.toString(num,8));		
		}
	}
}
