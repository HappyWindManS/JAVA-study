package Client;

import java.util.Scanner;

import Server.ObPort;

public class MyClient {

	private final String name = "MR_QIN";
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("请选择你要连接的服务器");
		int port = input.nextInt();
		System.out.println("请输入你的用户名");
		String name = input.next();
		Message mess = new Message(name);
		new Thread(new Post(port,mess)).start();
	}
}
