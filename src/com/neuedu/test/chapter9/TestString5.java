package com.neuedu.test.chapter9;

public class TestString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getLength();
	}
	
	public static void getNum()
	{
		String str = "abedsfgwewerwerwewerw";
		
		int num = 0;
		for(int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
			
			if(c == 'e')
			{
				num++;
			}
		}
		
		System.out.println("e������"+num+"��");
	}
	
	public static void getLength()
	{
		String str = "abe";
		int count = 0;
		while(true)
		{
			try
			{
				str.charAt(count);
				count++;
			}
			catch(IndexOutOfBoundsException e)
			{
				break;
			}	
		}
		
		System.out.println(count);
	}
}
