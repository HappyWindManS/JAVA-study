package com.mr.chapter02;

public class Ex25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr = new int[3][];
        arr[0] = new int[]{11,12};
        arr[1] = new int[]{21,22,23};
        arr[2] = new int[]{31,32,33,34};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
        	int gruopSum = 0;
        	for(int j=0;j<arr[i].length;j++){
        		gruopSum += arr[i][j];
        	}
        	sum += gruopSum;
        	System.out.println("��"+(i+1)+"С�����۶�Ϊ��"+gruopSum+"��Ԫ��");
        }
        System.out.println("�����۶�Ϊ��"+sum+"��Ԫ��");
	}

}
