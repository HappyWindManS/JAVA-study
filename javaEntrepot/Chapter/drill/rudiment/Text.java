package rudiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Text {

	public static void main(String[] args)throws IOException {
		StreamTokenizer st =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		double a = st.nval;
		st.nextToken();
		a += st.nval;
		System.out.print((int)a);
	}
}


