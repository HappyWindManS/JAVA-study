package recurrence;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//һ���������������ĺͲ�������
		//�򣬵������ɸ�������ʱ��
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int time = input.nextInt();
		int[] array = new int[number];
		for(int i =0;i<number;i++)
		{
			array[i] = input.nextInt()%2;
		}
		
	}

}
