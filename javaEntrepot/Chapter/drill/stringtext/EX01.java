package stringtext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX01 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String text = input.readLine();

		System.out.println(text.replaceAll(" ", "").length());

	}

}
