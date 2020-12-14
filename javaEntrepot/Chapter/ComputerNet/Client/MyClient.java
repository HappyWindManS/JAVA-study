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
 * ����TCPЭ���Socketͨ�ţ�ʵ���û���¼-�ͻ���
 */
public class MyClient {
 
    public static void main(String[] args) {
        // 1.�����ͻ��˵�Socket��ָ����������IP�Ͷ˿�
        try {
            Socket socket = new Socket("192.168.1.103", 8080);
            Scanner input = new Scanner(System.in);
            // 2.��ȡ��Socket��������������������������Ϣ
            OutputStream os = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            System.out.println("�����������û���");
            Message mess = new Message("",input.next());      
            oos.writeObject(mess);
            System.out.println("�ɹ�����������");
            
            while(true)
            {        	
            	mess.setMessage(input.next());
	            oos.writeObject(mess);
	            socket.shutdownOutput();
	            String infoString=null;            
	            // 3.��ȡ��������ȡ�÷���������Ϣ
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