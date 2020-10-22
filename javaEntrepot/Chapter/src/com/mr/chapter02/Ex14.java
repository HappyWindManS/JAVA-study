package com.mr.chapter02;

public class Ex14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=9;i>=1;i--){
        	if(9-i!=-1){
        		for(int a=1;a<i;a++){
        			System.out.print("     "+"\t");
        		}
        	}
        	for(int j=9;j>=i;j--){
        		System.out.print(j+"*"+i+"="+j*i+"\t");
        	}
        	System.out.println();
        }
	}

}
