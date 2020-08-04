package com.neuedu.test.chapter7.copy;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColaEmployee[] emps = new ColaEmployee[3];
		emps[0] = new SalariedEmployee(8000,"xiaoming",8);
		emps[1] = new HourlyEmployee(200,180,"xiaogang",10);
		emps[2] = new SalesEmployee(190000,0.15,"Ð¡ºì",8);
		
		Company c = new Company();
		
		for(ColaEmployee e :emps)
		{
			c.showInfo(e, 8);
		}
	}

}

class Company{
	
	public void showInfo(ColaEmployee c, int month)
	{
		System.out.println(c.name+","+c.getSalary(month));
	}
	
}

class ColaEmployee{
	String name;
	int birth;
	
	public ColaEmployee(String name, int birth)
	{
		this.name = name;
		this.birth = birth;
	}
	
	public double getSalary(int month)
	{
		if(month == this.birth)
		{
			return 100;
		}
		return 0;
	}
	
}

class SalariedEmployee extends ColaEmployee{
	
	double salary;
	
	public SalariedEmployee(double salary, String name, int birth)
	{		
		super(name,birth);
		this.salary = salary;
	}
	
	@Override
	public double getSalary(int month)
	{
		return super.getSalary(month) + this.salary;
	}
		
}

class HourlyEmployee extends ColaEmployee{
	
	double hsal;
	int hours;
	
	public HourlyEmployee(double hsal, int hours,String name, int birth)
	{
		super(name,birth);
		this.hsal = hsal;
		this.hours = hours;
	}
	
	@Override
	public double getSalary(int month)
	{
		double total =0;
		if(hours>160)
		{
			total = (hours-160)*hsal*1.5 + 160*hsal;
		}
		else
		{
			total = hours * hsal;
		}
		return super.getSalary(month) + total;
	}
	
}

class SalesEmployee  extends ColaEmployee{
	
	double money;
	double percentage;
	
	public SalesEmployee(double money,double percentage,String name, int birth)
	{
		super(name,birth);
		this.money = money;
		this.percentage = percentage;
	}
	
	@Override
	public double getSalary(int month)
	{
		return super.getSalary(month) + this.money * this.percentage;
	}
	
}
