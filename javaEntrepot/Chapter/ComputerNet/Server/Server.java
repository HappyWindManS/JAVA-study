package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private int port;
	
	Server(int port)throws IOException
	{
		this.setPort(port);
		Socket client = null;
		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(port);
		System.out.println("���������������ڼ���:"+port+"�˿�");
		int i = 1;
		while(true)
		{
			System.out.println("�ѽ����"+i+"��");
			client = server.accept();
			new Thread(new ObPort(client)).start();
			i++;
		}
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
