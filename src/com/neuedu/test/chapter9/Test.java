package com.neuedu.test.chapter9;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����2��student����
		Student s1 = new Student("xx",10);
		Student s2 = new Student("yy",20);
		
		System.out.println(s1);//Ĭ�ϵ�����s1.toString()
		System.out.println(s2);//Ĭ�ϵ�����s1.toString()
		
		//Ĭ��object��equals�Ƚϵ���2��������ڴ��ַ
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
		
		//��ӡs1��s2�Ĺ�ϣ��
		/*
		 * ��ϣ�룺  ��ϣ�벻ͬ������һ����ͬ
		 *       ��ϣ����ͬ�����������ͬ�����ܲ�ͬ��
		 * */
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}

class Student{
	
	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		
		Student s2 = (Student)obj;
		
		if(this.name.equals(s2.name) && this.age == s2.age)
		{
			return true;
		}
		
		return false;
		
	}
	
	@Override
	public String toString() {
		return this.name +","+this.age;
	}
}

class Employee{
	
	private String name;
	private String department;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e2 = (Employee)obj;
		
		if(this.name.equals(e2.name) && this.department.equals(e2.department))
		{
			return true;
		}
		
		return false;
		
	}
	
	
	
}
