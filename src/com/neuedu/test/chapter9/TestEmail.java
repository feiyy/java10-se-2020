package com.neuedu.test.chapter9;

public class TestEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "feiyy@neusoft.com";
		
		//����@�� ����.
		//@��.ǰ��   @�����ڿ�ͷ�� .�����ڽ�β�� @��.�м��������
		
		if(email.indexOf("@")<=0)
		{
			System.out.println("���벻�Ϸ�");
			return;
		}
		
		if(email.indexOf(".")<0 || email.indexOf(".") == email.length()-1)
		{
			System.out.println("���벻�Ϸ�");
			return;
		}
		
		if(email.indexOf("@")>email.indexOf("."))
		{
			System.out.println("���벻�Ϸ�");
			return;
		}
		
		if(email.indexOf(".") - email.indexOf("@")==1)
		{
			System.out.println("���벻�Ϸ�");
			return;
		}
		
		System.out.println("����Ϸ�");

	}

}
