package arithmetic1025;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		/*
		 *已知寻找素数范围301-400
		 *大于23*23的数，如果不是素数，都将被23以下素数整除*/

		
		//定义素数数组
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//寻找21以下质数,存入数组
		
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

		//查找300-400的质数
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
