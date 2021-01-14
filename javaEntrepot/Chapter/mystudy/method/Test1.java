package method;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeMap<String,String> tm = new TreeMap<String,String>(new Comparator(){
			public int compare(Object o1, Object o2) {
				// TODO 自动生成的方法存根
				int i1 = (int)o1);
				int i2 = (int)o2);
				return i2-i1;
			}		
		});
			tm.put("1", "A1");
			tm.put("2", "A1");	tm.put("5", "A1");	tm.put("4", "A1");	tm.put("3", "A1");
			Set s = tm.keySet();
			Iterator i = s.iterator();
			while(i.hasNext())
			{
				String temp = i.next();
				String v =  tm.get(temp);
				System.out.println(temp+":"+v);
			}
	}
}
