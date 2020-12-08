package test;

public class Test {

	public static void main(String[] args) {

        //发送 POST 请求
        for(int i=0;i<8;i++)
        {
	        String sr = HttpRequest.sendPost("http://10.3.134.110:8090", "hallo world");
	        new Thread(new text()).start();
        }
	}
	
	
}
class text implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true)
			{
		 String sr = HttpRequest.sendPost("http://10.3.134.110:8090", "hallo world");
	}}
}