package Client;

import java.util.Scanner;

import Server.ObPort;

public class MyClient {

	private final String name = "MR_QIN";
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ����Ҫ���ӵķ�����");
		int port = input.nextInt();
		System.out.println("����������û���");
		String name = input.next();
		Message mess = new Message(name);
		new Thread(new Post(port,mess)).start();
	}
}
