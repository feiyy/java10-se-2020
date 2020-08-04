package com.neuedu.test.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//catch块注意顺序问题，子类异常在前，父类异常在ho
		try{
			int a = 10;
			int b = 0;
			int c = a/b; //算数异常
			
			int[] arr = new int[2];
			arr[2] = 10;//越界异常
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt(); //输入不匹配	
			
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
