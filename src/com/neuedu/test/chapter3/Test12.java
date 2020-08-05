package com.neuedu.test.chapter3;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		//À¿—≠ª∑
		for(int i=1;;i=i+2)
		{
			if(i<=100)
			{
				sum+=i;
			}
			else
			{
				System.out.println(sum);
				return;
			}
		}

	}

}
