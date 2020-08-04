package com.neuedu.test.chapter7.copy;

public class Chinese {
	
	String name;
	static String country;
	int age;
	
	//����ص��ڴ棬�Զ�ִ��
	/*��ʲôʱ�򱻼��ص��ڴ棺
	 * 
	 * 1. Chinese.����/����
	 * 2. Chinese c = new Chinese();
	 * 
	 */
	
	/*
	 * ˳��
	 * ��̬�����
	 * ���췽��
	 * 
	 * 
	 * */
	
	/*
	 * ���ã���static�����Ը���ֵ
	 * */
	static{
		
		country = "�й�";
		
		System.out.println("static");		
	}
	
	public Chinese()
	{
		System.out.println("constructor");
	}
	
	public Chinese(String name, int age)
	{
		this.name = name;
		this.age = age;
		
		System.out.println("constructor");
		
	}
	
	/*
	 * ע��: static�ķ�����ֻ�ܷ���static������
	 *      static�ķ�����Ҳ����д this, super
	 *      
	 * ʲô���������static�������ﲻ��Ҫ���ʶ������ԣ������Կ��Ƕ���ɾ�̬��
	 * ����ɾ�̬�ô������õ�ʱ�� ֱ��������.�������Ϳ��ԡ�
	 * */
	public static void showInfo()
	{
		System.out.println(country);
	}
	
	public void showName()
	{
		//���Է���static����ô��
		System.out.println(country);
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chinese c1 = new Chinese();
		c1.name = "xx";		
		Chinese.country = "�й�";
		c1.age = 20;
		
		Chinese c2 = new Chinese();
		c2.country ="�л����񹲺͹�";
		//System.out.println(Chinese.country);
		
		showInfo();

	}

}
