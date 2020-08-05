package com.neuedu.test.chapter7;

public class Worker extends Employee{
	
	double dressAllowance;
	
	public double getDressAllowance()
	{
		return this.dressAllowance;
	}
	
	public static void main(String[] args) {
		
		//创建一个worker的对象
		Worker w = new Worker();
		w.name ="xiaoli";
		w.age = 20;
		w.department="research";
		w.dressAllowance = 200;
		
		w.getDressAllowance();
		
	}

}
