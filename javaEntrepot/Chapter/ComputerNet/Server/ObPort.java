package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Calendar;

import client.Message;


public class ObPort implements Runnable{
    Socket socket=null;
     
    public ObPort(Socket socket) {
        super();
        this.socket = socket;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        OutputStream os = null;
        PrintWriter pw = null;
        try {
            InputStream is = socket.getInputStream();
            ObjectInputStream ois=new ObjectInputStream(is);
            //readObject()�������뱣֤����˺Ϳͻ��˵�User����һ�£�Ҫ��Ȼ������Ҳ�����Ĵ���
            // System.out.println("�ͻ��˷��͵Ķ���" + (Message)ois.readObject());
            Message mess = (Message)ois.readObject();
            os=socket.getOutputStream();
            pw=new PrintWriter(os);
            pw.println(mess.getMessage()+"  ����"+mess.getUser());
            pw.flush();          
            
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try{
                if(pw!=null){
                    pw.close();
                }
                if(os!=null){
                    os.close();
                }
                if(socket!=null){
                    socket.close();
                }
            }catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }

        }
    }
    
}