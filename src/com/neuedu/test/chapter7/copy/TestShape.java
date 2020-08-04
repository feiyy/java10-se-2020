package com.neuedu.test.chapter7.copy;

/*
 *  抽象类 vs 接口
 *  
 *  抽象类： 子类  is a父类
 *  接口： 子类 has接口的行为
   
 *  1） 抽象类有属性，接口没有属性（可以有常量）
 * 
 * */


public class TestShape {
	
	public static void main(String[] args) {
		
		
		
	}

}


/*
 * 抽象类中可以有抽象方法，也可以有非抽象方法
 * 
 * 注意：
 * 1) 抽象类不能new对象, 不完整
 * 
 * */
interface Shape{
	
	public abstract double getArea();
	
	public abstract double getPer();
	
	default public void test(){
		
	}
		
} 

class Circle implements Shape{
	
	int radius;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * this.radius * this.radius;
	}

	@Override
	public double getPer(){
		return 2 * 3.14 * this.radius;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		Shape.super.test();
	}

}


