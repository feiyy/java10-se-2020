package com.neuedu.test.chapter6;

public class Employee {

	//���� -> ��Ĭ��ֵ
	String name;
	int age;
	double salary;
	
	//Ĭ�ϵĹ��췽������������
	//1. ���������������һ��
	//2. �����з���ֵ
	public Employee()
	{
		//��һ�����췽���������һ�����췽��
		//this("JONE DOE",18,200);
		//this()������ڹ��췽���ĵ�һ�仰��
		this("JONE DOE");
		this.age = 20;
		this.salary = 200;
	}
	
	//�вεĹ��췽��
	//���췽��Ҳ��������
	//�ر�ע�⣺ ����Լ������˹��췽����jdk�Ͳ�������Ĭ�ϵ��޲εĹ��췽��-�� һ���Լ����вΣ�һ�����޲ε�д����
	//this ����ǰ����
	public Employee(String name, int age, double salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	
	public Employee(String name)
	{
		this.name = name;
	}
		
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void updateName(String name)
	{
		this.name = name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public static void main(String[] args) {
		
		//����һ��Ա���Ķ���
		//new Employee(), ������Ĺ��췽��
        Employee e1 = new Employee();
        e1.name ="feiyy";
        e1.updateName("james");
        
        
       // System.out.println(e1.name);
       // System.out.println(e1.getName());
        
        //ʹ���вεĹ��췽������һ��Ա��
        Employee e2 = new Employee("maomao",6,22.33);
        
        System.out.println(e2.name);
        System.out.println(e2.age);
        System.out.println(e2.salary);
        
        //�ٴ���һ��Ա��
        Employee e3 = new Employee("lele");
        
			
	}
}
