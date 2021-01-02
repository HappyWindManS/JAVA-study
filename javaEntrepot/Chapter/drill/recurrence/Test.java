package recurrence;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num = 6;
		int time = 6;
		System.out.println(getNum(num,time));
	}
	
	public static int getNum(int num,int time)
	{
		int ref = num-time+1;
		int ret = 0;
		int temp = time/2;
		while(ref >= temp)
		{
			ret += ref;
			ref--;
		}
		return ret;
	}

}
