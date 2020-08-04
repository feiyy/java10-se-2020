package com.neuedu.test.chapter7;

/*
 * 
 * ��̬��������
 * 
 * 1. ���Ӽ̳й�ϵ
 * 2. ������д���෽��
 * 3. ��������ָ��������� -�� ����ת��
 *
 */
public class TestPrinter {

	public static void main(String[] args) {
		
		Printer p = new BlackWhitePrinter();
		
		//�ر�ע�⣬���õĲ��Ǹ������ķ��������Ǿ�������ķ���
		p.print();//�����˶�̬��Ч��
		
	}

}

class Printer{
	
	public void print()
	{
		System.out.println("print");
	}
	
}

class ColoredPrinter extends Printer{

	@Override
	public void print() {
		System.out.println("coloredprint");
	}

}

class BlackWhitePrinter extends Printer{
	
	@Override
	public void print() {
		System.out.println("blackwhiteprint");
	}
	
}
