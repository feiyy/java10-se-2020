package com.neuedu.test.chapter10;

import java.util.LinkedList;

public class TestQueue {
	
	public static void main(String[] args) {
		
		MyQueue<String> q = new MyQueue<>();
		
		q.put("aa");
		q.put("bb");
		q.put("cc");
		
		while(!q.isEmpty())
		{
			System.out.println(q.get());
		}
		
	}

}

class MyQueue<T>{
	
	LinkedList<T> list = new LinkedList<>();
	
	public void put(T t){		
		list.addLast(t);	
	}
		
	public T get()
	{	
		return list.removeFirst();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public int size()
	{
		return list.size();
	}
	
		
}
