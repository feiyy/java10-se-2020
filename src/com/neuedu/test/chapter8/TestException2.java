package com.neuedu.test.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//catch��ע��˳�����⣬�����쳣��ǰ�������쳣��ho
		try{
			int a = 10;
			int b = 0;
			int c = a/b; //�����쳣
			
			int[] arr = new int[2];
			arr[2] = 10;//Խ���쳣
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt(); //���벻ƥ��	
			
			FileInputStream ins = new FileInputStream("d:/a.txt");
		}	
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | FileNotFoundException e)
		{
			e.printStackTrace();
		}		
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("continue...");

	}

}
