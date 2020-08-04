package com.neuedu.test.chapter10;

public class Test8<E extends Number> {
	
	public double sum(E a, E b)
	{
		return a.doubleValue() + b.doubleValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test8<Integer> t = new Test8<>();
		
		double d1 = t.sum(10, 10);
		
		Test8<Long> t2 = new Test8<>();
		double d2 = t2.sum(10000L, 110000L);
		
		
		Test8<Double> t3 = new Test8<>();
		double d3 = t3.sum(23.3, 34.4);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		

	}

}
