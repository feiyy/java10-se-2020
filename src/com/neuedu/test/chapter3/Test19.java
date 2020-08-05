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
				//整除了
				System.out.println("不是质数");
				break;
			}
		}
		
		if(i==num)//一个都没整除
		{
			//break到这了
			System.out.println("是质数");
		}
        
	}

}
