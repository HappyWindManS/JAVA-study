package com.mr.chapter05;

public class Ex14 {

	public static void main(String[] args)throws Exception {
		// TODO �Զ����ɵķ������
		
		//����һ��Runtimeʵ������
		Runtime rt = Runtime.getRuntime();
		//�õ���ʾ���̵�Process
		//Process����������Runtimeʵ��exec����
		//���ڻ�ȡexec������������������Ϣ
		Process process = rt.exec("notepad.exe");
		
		//������������
		Thread.sleep(3000);
		//�رս���
		process.destroy();
		
	}

}