package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class P1608分数线划定 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int time = (int) input.nval;
		input.nextToken();
		int get = (int) (input.nval * 1.5);
		
		TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>(Comparator.reverseOrder());
		
		for(int i=0;i<time;i++)
		{
			input.nextToken();
			int temp = (int) input.nval;
			input.nextToken();
			int key = (int) input.nval;
			tm.put(key, temp);
		}
		
		Set set = tm.keySet();
		Iterator ite = set.iterator();
		int oldTime = 0;
		
		while(ite.hasNext())
		{		
			int temp = (int) ite.next();
			if(get<=0)
			{
				if(oldTime == temp)
				{
					System.out.println(temp+" "+tm.get(temp));
					continue;
				}
				else
				{
					break;
				}
			}
			System.out.println(temp+" "+tm.get(temp));
			oldTime = temp;
		}
	}

}
