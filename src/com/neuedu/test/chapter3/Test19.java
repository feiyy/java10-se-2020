package com.neuedu.test.chapter3;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int num = 9;
		
		int i=2;
		for(;i<=num-1;i++)
		{
			if(num%i==0)
			{
				//������
				System.out.println("��������");
				break;
			}
		}
		
		if(i==num)//һ����û����
		{
			//break������
			System.out.println("������");
		}
        
	}

}
