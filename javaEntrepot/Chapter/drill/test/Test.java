package test;

public class Test {

	//public static int[] array = new int[] {1,2,3,4,5,6,7,8,9};
	public static char[] array = new char[] {'a','b','c'};
	public static void main(String[] args) {
		f(0);
	}
	
	public static void f(int k)
	{
		if(k==3)
		{
			for(int l=0;l<array.length;l++)
			{
				System.out.print(array[l]);
			}
			System.out.println();
		}
		
		else
		{
			for(int i=k;i<array.length;i++)
			{
				char t = array[i];
				array[i] = array[k];
				array[k] = t;					
								
				f(k+1);
				
				t = array[i];
				array[i] = array[k];
				array[k] = t;	
			}
		}
	}
}
