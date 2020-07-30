package com.neuedu.test.chapter3;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue
		//打印20以内的奇数
		//return(方法结束), break（结束整个循环）, continue（结束本次循环，进入下次循环）
		for(int i=1; i<20;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			
			System.out.println(i);
		}

	}

}
