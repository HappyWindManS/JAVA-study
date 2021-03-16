package test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class 钥匙和房间LeetCode_841 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<ArrayList<Integer>> rooms = new ArrayList<ArrayList<Integer>>() {};
		ArrayList temp0 = new ArrayList(){};
		temp0.add(6);
		temp0.add(7);
		temp0.add(8);
		ArrayList temp1 = new ArrayList(){};
		temp1.add(5);
		temp1.add(4);
		temp1.add(9);
		ArrayList temp2 = new ArrayList(){};
		temp2.add(0);
		ArrayList temp3 = new ArrayList(){};
		temp3.add(8);
		temp3.add(4);
		//temp3.add(3);
		ArrayList temp4 = new ArrayList(){};
		temp4.add(4);
		ArrayList temp5 = new ArrayList(){};
		temp5.add(0);
		ArrayList temp6 = new ArrayList(){};
		temp6.add(1);
		temp6.add(9);
		temp6.add(2);
		temp6.add(3);
		ArrayList temp7 = new ArrayList(){};
		temp7.add(7);
		ArrayList temp8 = new ArrayList(){};
		temp8.add(6);
		temp8.add(5);
		ArrayList temp9 = new ArrayList(){};
		temp9.add(2);
		temp9.add(3);
		temp9.add(1);
		
		rooms.add(temp0);
		rooms.add(temp1);
		rooms.add(temp2);
		rooms.add(temp3);
		rooms.add(temp4);
		rooms.add(temp5);
		rooms.add(temp6);
		rooms.add(temp7);
		rooms.add(temp8);
		rooms.add(temp9);
		
		Solution s = new Solution();
		System.out.println(s.canVisitAllRooms(rooms));
	}
	

}
class Solution {
    public boolean canVisitAllRooms(List<ArrayList<Integer>> rooms) { 
    	boolean[] array= new boolean[rooms.size()];
    	array[0] = true;
    	boolean bool = true;
    	boolean[] tempAr = array.clone();

    f1:	for(int i=0;i<tempAr.length;i++)
    	{
    		if(tempAr[i]==true)
    		{
    			//进入可以进入的房间
    			for(int l=0;l<array.length;l++)
    			{
    				if(tempAr[l]==true)
    				{
	    				List temp1 = rooms.get(l);	
	    	    		//获取当前房间的钥匙
	    	        	Iterator iterator1 = temp1.iterator();
	    	        	while(iterator1.hasNext())
	    	        	{
	    	        		//解锁房间
	    	        		array[(int) iterator1.next()] = true;
	    	        	}
    				}
    			}	    		
	        	//判断是否能进入新房间
	        	boolean b = true;
	        	for(int l=0;l<tempAr.length;l++)
	        	{
	        		if(tempAr[l]!=array[l])
	        		{
	        			i = 0;
	        			b = false;
	        		}
	        	}
	        	if(b)
	        	{
	        		break f1;
	        	}
	        	else
	        	{     		
	        		tempAr = array.clone();
	        	}
    		}
    	}
    	
    	//判断是否有未解锁的房间
		for(int l=0;l<tempAr.length;l++)
		{
			if(tempAr[l]==false)
			{
				bool = false;
			}        			
		}      
		return bool;
    }
}