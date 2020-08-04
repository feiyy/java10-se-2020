package com.neuedu.test.chapter9;

public class TestStringBuffer {

	/*
	 * StringBuffer（先有）:线程安全的 有synchronized， 多个线程同时操作StringBuffer里数据，数据不错。
	 * StringBuilder(后有)：线程不安全的 没有synchronized, 多个线程同时操作StringBuilder里的数据，数据可能出错。
	 * 
	 * 多线程：使用StringBuffer,数据安全
	 * 单线程：使用StringBuilder,效率高
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		StringBuilder buffer = new StringBuilder("hello");
		
		buffer.append("world");
		
		//System.out.println(buffer);
		//System.out.println(buffer.toString());
		
		//String str = buffer.toString();
		
		//buffer.insert(0, "w");
		//System.out.println(buffer);
		
		//buffer.deleteCharAt(1);
		//System.out.println(buffer);
		//buffer.delete(1, 4);
		//System.out.println(buffer);
		
		buffer.replace(0, 2, "abc");
		System.out.println(buffer);
		
		
		

	}

}
