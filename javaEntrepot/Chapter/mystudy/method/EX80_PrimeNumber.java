package method;

public class EX80_PrimeNumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		for(int i=0;i<100;i++)
		{
			System.out.println(primeNumber(i)?i+"是素数":i+"不是素数");
		}
	}
	public static boolean primeNumber(int num)
	{
		for(int i=2;i<num+1/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
