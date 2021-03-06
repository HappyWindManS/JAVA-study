package arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Hashtable;

public class EX04 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int size = (int) input.nval;
		Hashtable hash = new Hashtable(size);
		for(int i=0;i<size;i++)
		{
			input.nextToken();
			hash.put((int)input.nval,i);
		}	
		int[] sum = new int[1];
		boolean[] bool = new boolean[1];
		hash.forEach((key,value) -> 
		{
			bool[0] = true;
			hash.forEach((k,v) -> 
			{
				int temp = (int)key-(int)k;
				if(hash.containsKey(temp)&&(int)k!=temp&&bool[0]==true)
				{					
					sum[0]++;
					bool[0] = false;
				}
			});
		});
		System.out.println(sum[0]);
	}

}