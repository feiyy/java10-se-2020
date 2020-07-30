package com.neuedu.test.chapter3;

public class Test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int param = 120;
		
		/*for(int i=2;i<=param;i++)
		{
			while(param!=i)
			{
				if(param%i==0)
				{
					System.out.print(i+"*");
					
					param = param/i;
				}
				else
				{
					break;
				}
			}
		}
		
		System.out.print(param);*/
		
		for(int i=2;;)
		{			
			if(param%i==0)
			{
				param = param/i;
				if(param !=1)
				{
					System.out.print(i+"*");
				}
				else
				{
					System.out.print(i);
					break;
				}					
				
			}
			else
			{
				i++;
			}			
		}
	}

}
