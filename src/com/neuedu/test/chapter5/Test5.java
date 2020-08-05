package com.neuedu.test.chapter5;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = fn(5);
		
		System.out.println(num);
		
		int num2 = feibonaqie(8);
		
		System.out.println(num2);

	}
	/*
	 * 自己调用自己，递归调用
	 * 
	 * */
	public static int fn(int n)
	{
		if(n == 2)
		{
			return 2;
		}
		else
		{
			return n * fn(n-1);
		}
	}
	
	public static int feibonaqie(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
			return feibonaqie(n-1) + feibonaqie(n-2);
		}
	}

}
