package com.neuedu.test.chapter5;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 t = new Test3();
		System.out.println(t.sum(10, 10));
		System.out.println(t.sum(12.5, 12.5));

	}
	
	//���صķ���
	//1. ������һ����
	//2. ����������ͬ
	/*public int sum(int a, int b)
	{
		return a +b;
	}*/
	
	/*���Ƿ�������*/
	public double sum(int x, int y)
	{
		return x + y;
	}
	
	public double sum(int a, double b)
	{
		return a + b;
	}
	
	public double sum(double a, int b)
	{
		return a + b;
	}
	
	public double sum(double a, double b)
	{
		return a +b;
	}
	
	

}
