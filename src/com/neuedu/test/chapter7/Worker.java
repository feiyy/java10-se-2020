package com.neuedu.test.chapter7;

public class Worker extends Employee{
	
	double dressAllowance;
	
	public double getDressAllowance()
	{
		return this.dressAllowance;
	}
	
	public static void main(String[] args) {
		
		//����һ��worker�Ķ���
		Worker w = new Worker();
		w.name ="xiaoli";
		w.age = 20;
		w.department="research";
		w.dressAllowance = 200;
		
		w.getDressAllowance();
		
	}

}
