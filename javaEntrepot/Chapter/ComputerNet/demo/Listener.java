package demo
;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Listener {
	private ServerSocket ss;
	private PrintWriter out; 
	public Listener(){
		System.out.println("服务器已开启，正在监听8080端口");
	try{		
		ss=new ServerSocket(8080);	
	    while(true){
		Socket socket=ss.accept();
	    String remotePort=":"+socket.getLocalPort();
	    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line=in.readLine();
		System.out.println("Client sent:"+ line);
	    out=new PrintWriter(socket.getOutputStream(),true);
		out.print("Hello,your message received!");
		out.close();
		in.close();
		socket.close();
	    }
	}
	catch(IOException e){
		         System.out.println("Connection failed");
	               }
	}
	public static void main(String[] args) {
	    new Listener();
	}
}