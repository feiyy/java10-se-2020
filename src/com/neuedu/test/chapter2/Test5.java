package com.neuedu.test.chapter2;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* \r �ص�����
		 * \n ���� 
		 * 
		 * ��eclipse�����У�����Ч��һ��
		 * 
		 * \b�˸�
		 * 
		 * ��eclipse�����У����Բ�������
		 * 
		 * 
		 * 0-9: ʮ����48
		 * A-Z: ʮ����65
		 * a-z: ʮ����97
		 * 
		 */
		char a = 'a';
		char b = '��';
		char c = '\u9FA5';
		char d = '\t';
		char e = '\'';
		char f = '\\';
		String g = "\"";
		
		System.out.print(a);
		System.out.print(b);
		System.out.print('\b');
		System.out.print(d);
		System.out.print(c);
		System.out.print('\r');
		System.out.print(e);
		System.out.print(f);
		System.out.println(g);
		
		System.out.println("escape\\bchar");
	    System.out.println("escape\\tchar");
	    System.out.println("escape\\rchar");
	    System.out.println("escape\\nchar");
	    System.out.println("\\����б����\\");
	    System.out.println("'���ڵ�������'");
	    System.out.println("\"����˫������\"");
	    System.out.println("��û��˫����");
	    
	    boolean flag = true;
	    boolean flag2 = false;
		

	}

}
