package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Scanner;

import javax.sound.midi.MidiDevice.Info;


/**
 * 基于TCP协议的Socket通信，实现用户登录-客户端
 */
public class MyClient {
 
    public static void main(String[] args) {
        // 1.创建客户端的Socket，指定服务器的IP和端口
        try {
            Socket socket = new Socket("192.168.1.103", 8080);
            Scanner input = new Scanner(System.in);
            // 2.获取该Socket的输出流，用来向服务器发送信息
            OutputStream os = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            System.out.println("请输入您的用户名");
            Message mess = new Message("",input.next());      
            oos.writeObject(mess);
            System.out.println("成功连接聊天室");
            
            while(true)
            {        	
            	mess.setMessage(input.next());
	            oos.writeObject(mess);
	            socket.shutdownOutput();
	            String infoString=null;            
	            // 3.获取输入流，取得服务器的信息
	            InputStream is = socket.getInputStream();
	            BufferedReader br=new BufferedReader(new InputStreamReader(is));
	            String info=null;
	            while((info=br.readLine())!=null){
	                System.out.println(info);
	            }
	            socket.shutdownInput();
	            /*
	            oos.close();
	            os.close();
	            is.close();
	            br.close();
	            socket.close();
	            */
            }
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}