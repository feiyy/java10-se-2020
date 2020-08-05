package com.neuedu.test.chapter3;

public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0; i<=100;i++)
		{
			for(int j=0; j<=100;j++)
			{
				for(int k=0; k<=100;k++)
				{
					if(i+j+k==100 && 3*i+4*j+0.5*k==100)
					{
						System.out.println("Ä¸¼¦£º"+i+",¹«¼¦£º"+j+",Ð¡¼¦£º"+k);
						
					}
				}
			}
		}*/
		
		for(int i=0; i<=33;i++)
		{
			for(int j=0;j<=25;j++)
			{
				int k = 100-i-j;
				
				if(i*3+j*4+k*0.5==100)
				{
					System.out.println("Ä¸¼¦£º"+i+",¹«¼¦£º"+j+",Ð¡¼¦£º"+k);
				}
			}
		}

	}

}
