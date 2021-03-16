package test;

import java.util.Scanner;

public class P1618三连击 {

	public static int[] array = {1,2,3,4,5,6,7,8,9};
	public static boolean bool = false;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		double r1 = input.nextDouble();
		double r2 = input.nextDouble();
		double r3 = input.nextDouble();
		
		getAll(0,r1,r2,r3);
		
		String s = "ABC";
		
		if(!bool)
		{
			System.out.println("No!!!");
		}
	}
	
	public static void getAll(int k,double r1,double r2,double r3)
	{
		if(k==8)
		{
			if(rule(array,r1,r2,r3))
			{
				System.out.println(array[0]+""+array[1]+""+array[2]+" "+array[3]+""+array[4]+""+array[5]+" "+array[6]+""+array[7]+""+array[8]);
				bool = true;
			}
		}
		
		for(int i=k;i<9;i++)
		{
			int temp =array[i];
			array[i] = array[k];
			array[k] = temp;
			
			getAll(k+1,r1,r2,r3);
			
			temp =array[i];
			array[i] = array[k];
			array[k] = temp;
		}
	}

	public static boolean rule(int[] array,double r1,double r2,double r3)
	{
		double temp1 = array[0]*100+array[1]*10+array[2];
		double temp2 = array[3]*100+array[4]*10+array[5];
		double temp3 = array[6]*100+array[7]*10+array[8];
	
		if(temp3/temp1==r3/r1&&temp2/temp1==r2/r1)
		{
			return true;
		}
		return false;
	}
}
