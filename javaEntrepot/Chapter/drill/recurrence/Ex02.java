package recurrence;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//һ���������������ĺͲ�������
		//�򣬵���X��������ʱ�򣬴���ѡ��Y������ӣ��õ�������һ����
		// NUM = ����+ż����ż���ĺ� OR �����������ĺ�
		//����ҪY��������ӵ�ʱ��
		//����������һ��Ϊ(����������+ż����ż��)
		//----------------------------------------
		//������4��������ѡ����ʱ
		//Ӧ�� sum = n(n%2=1)*j+m(m%2=0)*o
		//sum =  
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int time = input.nextInt();
		int[] array = new int[number];
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		for(int i =0;i<number;i++)
		{
			array[i] = input.nextInt();
		}
		for(int i=0;i<number;i++)
		{
			
		}
	}

}
