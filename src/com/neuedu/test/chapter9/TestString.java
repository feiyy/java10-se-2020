package com.neuedu.test.chapter9;

public class TestString {

	//�ַ����ǲ��ɱ�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = new String("hello");		
		String str3 = "hello";
		
		System.out.println(str1 == str2);//false
		System.out.println(str1 == str3);//true
		
		str3 = "helloyou";
		System.out.println(str1 == str3);//false
		
				
		char[] arr = {'n','e','u','s','o','f','t'};
		String str4 = new String(arr);
		System.out.println(str4);
		
		int x=10;
	    x+=x-=x-x;
	    
	    System.out.println(x);

	}

}
