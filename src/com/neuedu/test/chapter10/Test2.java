package com.neuedu.test.chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("s1");
		a.add("s2");
		
		
		ArrayList b = new ArrayList();
		b.add("c");
		b.add("d");
		b.addAll(a);
		
		//System.out.println(b.contains("s1"));
		
		//b.clear();
		
		//System.out.println(b.size());//4
		
		ArrayList c = new ArrayList();
		
		Student s1 = new Student("s1",18);
		c.add(s1);
		c.add(new Student("s2",20));
		c.add(new Student("s3",22));
		
		/*
		for(int i=0;i<c.size();i++)
		{
			Object o = c.get(i);
			Student s = (Student)o;
			
		}*/
		
		/*for(Object o :c)
		{
			Student s = (Student)o;
		}*/
		
		Iterator iter = c.iterator();
		
		while(iter.hasNext())
		{
			Object o = iter.next();
			Student s = (Student)o;
			System.out.println(s.name + ","+ s.age);
		}
			
	}

}

class Student{
	
	String name;
	int age;
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
}
