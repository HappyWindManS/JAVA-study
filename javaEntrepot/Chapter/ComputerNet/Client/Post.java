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
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		Socket socket = null;
		//���ӷ�����
		try {
			socket = new Socket("47.116.134.206", port);
			System.out.println("���ӷ������ɹ�");
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			System.out.println("����������ʧ��");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			System.out.println("����������ʧ��");
			e.printStackTrace();
		}
		
		//׼���������,��ȡ����ָ��
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
	}
}
