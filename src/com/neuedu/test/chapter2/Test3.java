package com.neuedu.test.chapter2;

import java.math.BigDecimal;

public class Test3 {
	
	public static void main(String[] args) {
		
		//ʮ����
		int a = 10;
		
		//ʮ������
		int b = 0X4D2;//16
		
		//�˽���
		int c = 010;//8
		
		//������
		int d = 0B100;//4
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//���ƻ�ת
		// ʮ���� -�� ʮ�����ˣ���(�̳���)
		// ʮ�����ˣ��� -�� ʮ���ƣ�Ȩ�ӷ���
		// ʮ�����ƣ� �� ��-�� ������
		
		//ʮ����ת����������
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		
		
	}

}
