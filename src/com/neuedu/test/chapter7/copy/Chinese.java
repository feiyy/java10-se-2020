package com.neuedu.test.chapter7.copy;

public class Chinese {
	
	String name;
	static String country;
	int age;
	
	//类加载到内存，自动执行
	/*类什么时候被加载到内存：
	 * 
	 * 1. Chinese.属性/方法
	 * 2. Chinese c = new Chinese();
	 * 
	 */
	
	/*
	 * 顺序：
	 * 静态代码块
	 * 构造方法
	 * 
	 * 
	 * */
	
	/*
	 * 作用：给static的属性赋初值
	 * */
	static{
		
		country = "中国";
		
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
	 * 注意: static的方法里只能访问static的属性
	 *      static的方法里也不能写 this, super
	 *      
	 * 什么方法定义成static：方法里不需要访问对象属性，都可以考虑定义成静态的
	 * 定义成静态好处：调用的时候， 直接用类名.方法名就可以。
	 * */
	public static void showInfo()
	{
		System.out.println(country);
	}
	
	public void showName()
	{
		//可以访问static属性么？
		System.out.println(country);
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chinese c1 = new Chinese();
		c1.name = "xx";		
		Chinese.country = "中国";
		c1.age = 20;
		
		Chinese c2 = new Chinese();
		c2.country ="中华人民共和国";
		//System.out.println(Chinese.country);
		
		showInfo();

	}

}
