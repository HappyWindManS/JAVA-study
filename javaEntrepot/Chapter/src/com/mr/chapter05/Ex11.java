package com.mr.chapter05;

public class Ex11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] srcArray = {101,102,103,104,105,106};
		int[] destArray = {201,202,203,204,205};
		
		//����src:ԴĿ������
		//����srcPos:ָԴĿ������ĵڼ�λ
		//����dest:Ŀ������
		//����destPos:��Ŀ������ĵڼ�λ��ʼճ��
		//����length:������Ԫ�ظ���
		System.arraycopy(srcArray, 2, destArray, 0, 4);
		
		for(int num:destArray)
		{
			System.out.println(num);
		}
	}

}
