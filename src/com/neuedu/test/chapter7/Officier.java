package com.neuedu.test.chapter7;

public class Officier extends Employee{
	
	double vehicleAllowance;
	
	public Officier()
	{
		//���ø����޲εĹ��췽��
		//Ĭ�ϱ���������ϡ�	
		//super()�����ڹ��������ǵ�һ�仰
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
	
	//super��thisʲôʱ���������
	//
	public void test()
	{
		//super ��������ʹ�ã����������
		System.out.println(super.name +","+super.age+","+super.department);
		System.out.println(this.name +","+this.age+","+this.department + this.vehicleAllowance);

	}
	
	public static void main(String[] args) {
		
		//����һ���������
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
