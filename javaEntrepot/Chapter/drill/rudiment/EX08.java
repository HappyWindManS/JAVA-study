package rudiment;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args){
		// TODO �Զ����ɵķ������
		Scanner st = new Scanner(System.in);
		String num = st.next();
		char[] array = num.toCharArray();
		String temp = "";
		for(int i=num.length();i>0;i--)
		{
			temp += array[i-1];
		}
		if(temp.contains("-"))
		{
			temp = "-"+temp.replace("-", "");
		}
		System.out.print(Integer.parseInt(temp));
	}

}
