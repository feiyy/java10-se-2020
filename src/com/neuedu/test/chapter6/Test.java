package com.neuedu.test.chapter6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = new Employee[100];
		
		Employee e;
		for(int i=0; i<100;i++)
		{
			e = new Employee();
			
			arr[i] = e;
		}
		
		//���⣬��������û���������Ϣ
		for(Employee item : arr)
		{
			System.out.println(item);
		}

	}

}
