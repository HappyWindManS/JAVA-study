package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ObPort implements Runnable{
	
	private Socket client;
	
	ObPort(Socket client)
	{
		this.client = client;
	}
	
	public void run()
	{
		BufferedReader in = null;
		
		while(true)
		{
			try {
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				System.out.println(in.readLine()); 
				
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
	}
}
