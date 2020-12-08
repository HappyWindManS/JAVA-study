package test;

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
		int i = 1;
		while(true)
		{
			System.out.println("服务已启动，正在监听:"+port+"端口,这是第"+i+"个服务器");
			client = server.accept();
			new Thread(new ObPort(client)).start();
		}
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
