package Server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	Server(int port)
	{
		 try {
	         ServerSocket serverSocket = new ServerSocket(port);
	         int count = 0;// ��¼�ͻ��˵�����
	         System.out.println("�������������ȴ��ͻ��˵����ӡ�����");
	         Socket socket = null;
	         while(true){
	             socket=serverSocket.accept();
	             ++count;
	             Thread serverHandleThread=new Thread(new ObPort(socket));
	             serverHandleThread.setPriority(4);
	             serverHandleThread.start();
	             System.out.println("���ߵĿͻ�����" + count + "����");
	             InetAddress inetAddress = socket.getInetAddress();
	             System.out.println("��ǰ�ͻ��˵�IP��ַ�ǣ�"+inetAddress.getHostAddress());
	         }
	     } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	     }
	}
}