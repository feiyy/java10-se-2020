package com.neuedu.test.chapter7.copy;

public class TestConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Consumer[] cs = new Consumer[3];
		cs[0] = new CollegeStudent("xx",19);
		cs[1] = new Employee();
		cs[2] = new CollegeStudent("yy",20);
		
		for(Consumer c: cs)
		{
			c.useCredit();
			c.test();
		}
	}

}

class Person{
	
	String name;
	int age;
	
	public void showInfo()
	{
		System.out.println(this.name+","+this.age);
	}	
}

interface Consumer{
	
	public void useCredit();
	
	default void test(){
		System.out.println("test");
	}
}

class CollegeStudent extends Person implements Consumer{
	
	public CollegeStudent(String name, int age)
	{
		super.name = name;
		super.age = age;
	}
	
	@Override
	public void useCredit(){
		
		System.out.println("student use credit");
		
	}

}

class Employee implements Consumer{

	@Override
	public void useCredit() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee use credit");
		
	}
	
	
}


