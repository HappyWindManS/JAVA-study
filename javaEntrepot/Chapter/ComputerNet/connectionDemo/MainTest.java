package connectionDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MainTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO �Զ����ɵķ������
		String url = "www.bbgu.edu.cn";
		/*
		InetAddress src = InetAddress.getLocalHost();
		InetAddress webIp = InetAddress.getByName(url);
		Runtime dos = Runtime.getRuntime();		
		Process p = dos.exec("PING "+ webIp.getHostAddress() +" -n 1");
		BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		while((line = input.readLine()) != null)
		{
			System.out.println(line);
		}*/
		
		while(true)
		{	
			String temp;		
			if(connectionWeb(url))
			{
				temp = "����ͨ";
			}
			else
			{
				temp = "������ͨ";
			}
			new SandEmail("longqiping@vip.163.com","3066004354@qq.com","https://www.bbgu.edu.cn/��״̬Ϊ��"+temp);
			new SandEmail("3066004354@qq.com","3066004354@qq.com","https://www.bbgu.edu.cn/��״̬Ϊ��"+temp);
			Thread.sleep(24 * 60 * 60 * 1000);
		}
	}
	
	
	
	public static boolean connectionWeb(String url) throws IOException
	{
		InetAddress webIp = InetAddress.getByName(url);
		return webIp.isReachable(3000);
	}

}


class SandEmail {
	
	SandEmail(String toEmail,String myEmail,String mess)
	{
		// �ռ��˵�������
	      String to = toEmail;
	 
	      // �����˵�������
	      String from = myEmail;
	 
	      // ָ�������ʼ�������Ϊ smtp.qq.com
	      String host = "smtp.qq.com";  //QQ �ʼ�������
	 
	      // ��ȡϵͳ����
	      Properties properties = System.getProperties();
	 
	      // �����ʼ�������
	      properties.setProperty("mail.smtp.host", host);
	 
	      properties.put("mail.smtp.auth", "true");
	      // ��ȡĬ��session����
	      Session session = Session.getDefaultInstance(properties,new Authenticator(){
	        public PasswordAuthentication getPasswordAuthentication()
	        {
	         return new PasswordAuthentication("3066004354@qq.com", "cnwckzljzkqwddgj"); //�������ʼ��û�������Ȩ��
	        }
	       });
	 
	      try{
	         // ����Ĭ�ϵ� MimeMessage ����
	         MimeMessage message = new MimeMessage(session);
	 
	         // Set From: ͷ��ͷ�ֶ�
	         message.setFrom(new InternetAddress(from));
	 
	         // Set To: ͷ��ͷ�ֶ�
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));
	 
	         // Set Subject: ͷ��ͷ�ֶ�
	         message.setSubject("������");
	 
	         // ������Ϣ��
	         message.setText(mess);
	 
	         // ������Ϣ
	         Transport.send(message);
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	   }
}


