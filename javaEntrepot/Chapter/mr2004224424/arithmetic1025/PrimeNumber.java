package arithmetic1025;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		/*
		 *��֪Ѱ��������Χ301-400
		 *����23*23�������������������������23������������*/

		
		//������������
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//Ѱ��21��������,��������
		
		boolean bool = true;
		for(int i=2;i<21;i++)
		{
			for(int l=2;l<=i/2;l++)
			{
				if(i%l==0)
				{
					bool = false;
				}		
			}
			if(bool == true)
			{
				arr.add(i);
			}
			else{
				bool =true;
			}
		}

		//����300-400������
		ArrayList<Integer> getArr = new ArrayList<Integer>();
		for(int i=301;i<=400;i=i+2)
		{
			for(int num:arr)
			{
				if(i%num==0)
				{
					bool = false;
				}				
			}
			if(bool == true)
			{
				getArr.add(i);
			}
			else{
				bool =true;
			}
		}
		System.out.println(getArr.size());
		System.out.println(getArr.toString().replace("[", "").replace("]", ""));
		
	}

}
