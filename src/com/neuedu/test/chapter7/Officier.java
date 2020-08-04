package com.neuedu.test.chapter7;


/*
 * ʵ�������࣬���ø���Ĺ��췽������ʼ����Դ�ڸ��������
 * 
 * super:ָ����Դ�ڸ�������Ժͷ���
 * super(): ���ø���Ĺ��췽����
 * 
 * */
public class Officier extends Employee{
	
	double vehicleAllowance;
	
	public Officier()
	{
		super();
		System.out.println(this);
	}
	
	public Officier(String name, int age, String department, double vehicleAllowance)
	{		
		super(name, age,department);
		this.vehicleAllowance = vehicleAllowance;
	}
	
	public double getVehicleAllowance()
	{
		return this.vehicleAllowance;
	}
	
	public void test()
	{
		System.out.println(super.name + "," + super.age+","+ this.vehicleAllowance);
	}
	
	public static void main(String[] args) {
		
		//��ǰһ���������
		Officier o = new Officier();
		
		System.out.println(o);
		
		
	
		
	}

}
