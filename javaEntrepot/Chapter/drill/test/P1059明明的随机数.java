package test;

import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;

public class P1059����������� {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter((new BufferedOutputStream(System.out))));
		input.nextToken();
		int time = (int) input.nval;
		
		TreeSet ts = new TreeSet();
		for(int i=0;i<time;i++)
		{
			input.nextToken();
			ts.add((int)input.nval);
		}
		
		long st = System.currentTimeMillis();
		for(Iterator iter = ts.iterator(); iter.hasNext(); ) 
		{
			  out.append(iter.next()+" ");
		}
		System.out.println(ts.size());
		out.flush();
		long end = System.currentTimeMillis();
		System.out.println(end-st);
		
		
		st = System.currentTimeMillis();
		for(Iterator iter = ts.iterator(); iter.hasNext(); ) 
		{
			 System.out.print(iter.next()+" ");
		}
		end = System.currentTimeMillis();
		System.out.println(end-st);
		
		
	
	}

}
