package com.neuedu.test.chapter7;


/*
 * 实例化子类，调用父类的构造方法，初始化来源于父类的属性
 * 
 * super:指向来源于父类的属性和方法
 * super(): 调用父类的构造方法。
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
		
		//当前一个子类对象
		Officier o = new Officier();
		
		System.out.println(o);
		
		
	
		
	}

}
