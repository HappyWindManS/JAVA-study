package Server;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class ObPort implements Runnable{
	
	private Socket client;
	Scanner keyBorad = new Scanner(System.in);
	
	ObPort(Socket client)
	{
		this.client = client;
		
	}
	
	public void run()
	{
		InputStream in = null;
		
		while(true)
		{
			try {
				in = client.getInputStream();
				ObjectInputStream obj = new ObjectInputStream(in);
				Message temp = null;
				try {
					temp = (Message)obj.readObject();
					
				} catch (ClassNotFoundException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				if(temp == null)
				{
					System.out.println("�û�"+temp.getUser()+"���˳�");
					break;
				}
				PrintWriter out = new PrintWriter(client.getOutputStream());
				out.println(temp.getMessage()+"   ����"+temp.getUser()+" --"+Calendar.getInstance());
				
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		}
	}
}
