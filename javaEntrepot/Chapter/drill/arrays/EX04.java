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
		hash.forEach((key,value) -> 
		{
			hash.forEach((k,v) -> 
			{
				int temp = (int)key-(int)k;
				if(hash.containsKey(temp)&&(int)k!=temp)
				{					
					sum[0]++;
				}
			});
		});
		System.out.println(sum[0]/2);
	}

}