package method;

public class factorial {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print(factorial(5));
	}
	
	public static int factorial(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		return num*factorial(num-1);
	}
	
}
