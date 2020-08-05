package com.neuedu.test.chapter7;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s= new Student();
		
		s.setName("xx");
		s.setAge(20);
		s.setSex("ÄÐ");
		
		Student s2 = new Student("yy",30,"Å®");
		
		s2.setName("zz");
		s2.setAge(25);
		s2.setSex("Å®");
		
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getSex());

	}

}
