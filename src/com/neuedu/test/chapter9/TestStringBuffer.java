package com.neuedu.test.chapter9;

public class TestStringBuffer {

	/*
	 * StringBuffer�����У�:�̰߳�ȫ�� ��synchronized�� ����߳�ͬʱ����StringBuffer�����ݣ����ݲ���
	 * StringBuilder(����)���̲߳���ȫ�� û��synchronized, ����߳�ͬʱ����StringBuilder������ݣ����ݿ��ܳ���
	 * 
	 * ���̣߳�ʹ��StringBuffer,���ݰ�ȫ
	 * ���̣߳�ʹ��StringBuilder,Ч�ʸ�
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		StringBuilder buffer = new StringBuilder("hello");
		
		buffer.append("world");
		
		//System.out.println(buffer);
		//System.out.println(buffer.toString());
		
		//String str = buffer.toString();
		
		//buffer.insert(0, "w");
		//System.out.println(buffer);
		
		//buffer.deleteCharAt(1);
		//System.out.println(buffer);
		//buffer.delete(1, 4);
		//System.out.println(buffer);
		
		buffer.replace(0, 2, "abc");
		System.out.println(buffer);
		
		
		

	}

}
