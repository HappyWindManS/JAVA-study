package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX03 {

	public static void main(String[] args){
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		int timeLength =input.nextInt();
		int kind = input.nextInt();
		
		List<herb> list = new ArrayList<herb>();
		//����������Ϣ
		for(int i=0;i<kind;i++)
		{
			int time=input.nextInt();
			int price=input.nextInt();
			if(time < timeLength)
			{
				herb temp = new herb(time,price); 
				list.add(temp);
			}
		}
		//ѡ��Ȩ������
		herb qz = new herb();
		double sum = 0;
		//��ѡ��ʱ�����ķ���
		for(herb temp:list)
		{
			if(qz.getTime()<temp.getTime())
			{
				qz=temp;
				qz.setNum((int)(timeLength/qz.getTime()));
			}
		}		
		sum = (int) (timeLength/qz.getTime()) *qz.getPrice();
		timeLength -= qz.getTime();
		//�Ż�����
		for(herb temp:list)
		{
			for(herb herbs:list)
			{
				
			}
		}
		System.out.print(sum);
	}
	
	public static class herb
	{
		herb()
		{ }
	    herb(int time,int price)
		{
			setTime(time);
			setPrice(price);
		}
		private int num;
	    
		private int time;
		
		private int price;

		public double getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
	}
}

