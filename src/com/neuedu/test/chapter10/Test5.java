package com.neuedu.test.chapter10;

import java.util.HashSet;
import java.util.Iterator;

public class Test5 {
	
	public static void main(String[] args) {
		
		//1. ȥ��
		//2. "����"
		HashSet s = new HashSet();
		s.add("jack");
		s.add("jack");
		s.add("tom");
		s.add("lucy");
		s.add("abc");
		
		//HashSetû���±�
		for(Object o: s)
		{
			System.out.println(o);
		}
		
		System.out.println("=================");
		
		Iterator iter = s.iterator();
		while(iter.hasNext())
		{
			Object o = iter.next();
			System.out.println(o);
		}
		
	}

}
