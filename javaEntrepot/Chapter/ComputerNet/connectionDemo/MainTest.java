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
		// TODO 自动生成的方法存根
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
				temp = "可连通";
			}
			else
			{
				temp = "不可连通";
			}
			new SandEmail("longqiping@vip.163.com","3066004354@qq.com","https://www.bbgu.edu.cn/的状态为："+temp);
			new SandEmail("3066004354@qq.com","3066004354@qq.com","https://www.bbgu.edu.cn/的状态为："+temp);
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
		// 收件人电子邮箱
	      String to = toEmail;
	 
	      // 发件人电子邮箱
	      String from = myEmail;
	 
	      // 指定发送邮件的主机为 smtp.qq.com
	      String host = "smtp.qq.com";  //QQ 邮件服务器
	 
	      // 获取系统属性
	      Properties properties = System.getProperties();
	 
	      // 设置邮件服务器
	      properties.setProperty("mail.smtp.host", host);
	 
	      properties.put("mail.smtp.auth", "true");
	      // 获取默认session对象
	      Session session = Session.getDefaultInstance(properties,new Authenticator(){
	        public PasswordAuthentication getPasswordAuthentication()
	        {
	         return new PasswordAuthentication("3066004354@qq.com", "cnwckzljzkqwddgj"); //发件人邮件用户名、授权码
	        }
	       });
	 
	      try{
	         // 创建默认的 MimeMessage 对象
	         MimeMessage message = new MimeMessage(session);
	 
	         // Set From: 头部头字段
	         message.setFrom(new InternetAddress(from));
	 
	         // Set To: 头部头字段
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));
	 
	         // Set Subject: 头部头字段
	         message.setSubject("网络监测");
	 
	         // 设置消息体
	         message.setText(mess);
	 
	         // 发送消息
	         Transport.send(message);
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	   }
}


