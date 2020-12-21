package stringtext;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		Integer[] array = new Integer[time];
		for(int i=0;i<time;i++)
		{
			array[i] = input.nextInt();
		}
				
		Arrays.sort(array,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO 自动生成的方法存根
				int lengtho1 = sizeOfInt(o1);
				int lengtho2 = sizeOfInt(o2);
				int lengthMin = Math.min(lengtho1, lengtho2);
				double temp1 = o1/Math.pow(10, lengtho1);
				double temp2 = o2/Math.pow(10, lengtho2);
				int num1 = (int) (temp1 * Math.pow(10,lengthMin));
				int num2 = (int) (temp2 * Math.pow(10,lengthMin));
				if(num1 == num2 && (o1>num1||o2>num2))
				{
					
				}
				return num2-num1;
			}
			
		});
		
		Arrays.asList(array).forEach(System.out::print);
	}
	
	 final static int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,    
	            99999999, 999999999, Integer.MAX_VALUE };    
	    static int sizeOfInt(int x) {    
	        for (int i = 0;; i++)    
	            if (x <= sizeTable[i])    
	                return i + 1;    
	    }    

}
