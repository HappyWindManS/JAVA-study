package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class one {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		double a = input.nval;
		input.nextToken();
		System.out.println((int)(a+input.nval));
	}

}
