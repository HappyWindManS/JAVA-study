package Client;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Post implements Runnable{

	private int port;
	private Message mess;
	
	Post(int port,Message mess) 
	{
		this.port = port;
		this.mess = mess;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		Socket socket = null;
		//连接服务器
		try {
			socket = new Socket("47.116.134.206", port);
			System.out.println("连接服务器成功");
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			System.out.println("服务器连接失败");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			System.out.println("服务器连接失败");
			e.printStackTrace();
		}
		
		//准备传输对象,获取键盘指令
		OutputStream outputStream;
		try {
			outputStream = socket.getOutputStream();
			ObjectOutputStream is = new ObjectOutputStream(outputStream);
			while(true)
			{
				mess.setMessage(input.next());
				is.writeObject(mess);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}
}
