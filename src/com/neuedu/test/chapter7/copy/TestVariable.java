package com.neuedu.test.chapter7.copy;

/*
 * ���������ͣ�
 * 
 * 1��  �ֲ����� -�����ڷ�����û��Ĭ��ֵ�����븳��ֵ������
 * 
 * 2�� ��Ա���������ԣ�-�� ���ڶ�����Ĭ��ֵ��
 * 
 * 3�� ��̬���� (������) -�� �����࣬ ��Ĭ��ֵ
 *  
 *  */
public class TestVariable {
	
	
	char a;
	
	static char b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestVariable t = new TestVariable();
		
		System.out.println(t.a);
		System.out.println((int)t.a);
		
		System.out.println(b);
		System.out.println((int)b);
		
		String c = null;
		
		System.out.println(c);
		

	}

}
