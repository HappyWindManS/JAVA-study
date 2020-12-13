package Server;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	Message messa;
	
	MyServer(int port)throws IOException
	{
		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(port);
		System.out.println("服务已启动，正在监听:"+port+"端口");
		Socket client = server.accept();
		
		try {
			ObjectInputStream obj =  new ObjectInputStream(new BufferedInputStream(client.getInputStream()));  
			messa = (Message)obj.readObject();
			PrintWriter out = new PrintWriter(client.getOutputStream(),true);
			out.println(messa.getMessage());
			
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
