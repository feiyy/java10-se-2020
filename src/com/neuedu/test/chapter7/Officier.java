package com.neuedu.test.chapter7;

public class Officier extends Employee{
	
	double vehicleAllowance;
	
	public Officier()
	{
		//调用父类无参的构造方法
		//默认编译器会加上。	
		//super()必须在构造器里是第一句话
		this(100);
		System.out.println("officier");
			
	}
	
	public Officier(double vehicleAllowance)
	{
		//super()
		this.vehicleAllowance = vehicleAllowance;
	}
	
	public Officier(String name, int age, String department, double vevehicleAllowance)
	{
		/*this.name = name;
		this.age = age;
		this.department = department;*/
		super(name, age, department);
		this.vehicleAllowance = vevehicleAllowance;
	}
	
	public double getVehicleAllowance()
	{
		return this.vehicleAllowance;
	}
	
	@Override
	public void getDetail()
	{
		//System.out.println(this.name + ","+this.age+","+this.department+","+this.vehicleAllowance);
	    super.getDetail();
	    System.out.println(this.vehicleAllowance);
	}
	
	//super和this什么时候会有区别
	//
	public void test()
	{
		//super 在子类里使用，代表父类对象
		System.out.println(super.name +","+super.age+","+super.department);
		System.out.println(this.name +","+this.age+","+this.department + this.vehicleAllowance);

	}
	
	public static void main(String[] args) {
		
		//创建一个子类对象
		Officier o = new Officier();
		o.name = "xiao hong";
		o.age = 18;
		o.department = "research";
		o.vehicleAllowance = 200;
		
		o.getVehicleAllowance();
		o.test();
		
		/*Officier o2 = new Officier(200);
		o2.work();*/
		
		Officier o3 = new Officier("xiaoming",25,"research",300);
		
		o3.getDetail();
		
	}

}
