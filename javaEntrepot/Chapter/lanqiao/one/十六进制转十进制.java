package one;

import java.util.Scanner;

public class 十六进制转十进制 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int num = Integer.parseInt(str,16);
		System.out.println(num);
	}

}
