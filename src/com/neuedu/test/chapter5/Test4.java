package com.neuedu.test.chapter5;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ZhiShu(200));

	}
	
	public static int jiecheng(int n)
	{
		int sum =1;
		for(int i =n; i>1;i--)
		{
			sum*=i;
		}
		return sum;
	}
	
	public static boolean isLeapYear(int year)
	{
		if(year%400==0)
		{
			return true;
		}
		if(year %4 ==0 && year %100 !=0)
		{
			return true;
		}
		return false;
	}
	
	public static int ZhiShu(int n)
	{
		for(int i=n+1;;i++)
		{
			boolean flag = true;//是质数
			for(int j=2; j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag = false;//不是质数
					break;
				}
			}
			if(flag)
			{
				return i;
			}
		}
	}
	

}
