package com.neuedu.test.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException6 {

	/*
	 * 手动抛出异常
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//test();
			
			//
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			//
		}
		
		System.out.println("continue..");
		
		try
		{
			test2();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}

	}
	
	public static void test() throws Exception
	{
		try{
			int a = 10;
			int b = 0;
			
			int c = a/b;
			
			System.out.println(c);
			
			FileInputStream ins = new FileInputStream("d:/a.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void test2()
	{
		int a = 10;
		int b = 3;
		
		if(a%b!=0)
		{
			throw new ArithmeticException();
		}
	}

}
