package rudiment;

import java.util.Arrays;
import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * ����ȡһ����ʱ������ֽ��1+2+3+4....+n����ʽ��Ȼ���ȡ������������
		 * */
		Scanner input = new Scanner(System.in);
		//��ȡ��
		int num = input.nextInt();
		
		int Column = 1;
		//temp���ڼ�¼�ڼ���ѭ��
		int temp = 1;
		while(num>Column)
		{
			num -= Column;
			Column++;
			temp++;
		}
		//�����ε�ѭ��һ����1��ǰ
		int laft = 1;
		if(temp%2==0)
		{
			System.out.println(laft+num+"/"+temp);
		}


	}
}
