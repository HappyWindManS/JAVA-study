package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class Seven {

	public static void main(String[] args)  {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int time = input.nextInt();
		int[] weight = new int[time];
		int[] value = new int[time];
		for(int i=0;i<time;i++)
		{
			weight[i] = input.nextInt();
			value[i] = input.nextInt();
		}
	
		System.out.println(getValue(weight,value,size));
	}
	  static int getValue(int[] weight, int[] value, int W) {	    
	        int n = weight.length;
	        if (n == 0) return 0;	
	        int[][] dp = new int[n + 1][W + 1];
	        for (int i = 1; i <= n; i++) {
	            for (int k = 1; k <= W; k++) {
	               int valueWith_i = (k-weight[i-1] >= 0) ? (value[i-1]+dp[i-1][k-weight[i-1]]) : 0;
	               int valueWithout_i = dp[i - 1][k];
	               dp[i][k] = Math.max(valueWith_i, valueWithout_i);
	            }
	        }
	        return dp[n][W];
	    }

}
