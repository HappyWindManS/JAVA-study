package rudiment;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		final int price=19;
		String text = input.next();
		String text2 = input.next();
		int num = Integer.parseInt(text+text2);
		System.out.println(num/price);
	}
}
