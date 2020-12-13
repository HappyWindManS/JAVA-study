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
		System.out.println("服务已启动，正在监听:"+port+"端口");
		int i = 1;
		while(true)
		{
			System.out.println("已接入第"+i+"个");
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
