package com.neuedu.test.chapter7.copy;

import java.util.Random;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aa";
		
		//Singleton s1 = new Singleton();
		//Singleton s2 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	
	}
}

/*
 * 单例的三个要素：
 * 1.构造方法私有
 * 2.private static Singleton instance
 * 3.public static Singleton getInstance()
 * */
class Singleton{
	
	/*
	 * 饿汉式
	 * */
	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	/*
	 * 懒汉式
	 * */
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
	
	
}
