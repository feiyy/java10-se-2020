package com.neuedu.test.chapter7;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1。创建一个Square的对象
		Square s = new Square();
		s.setBianchang(10);
		System.out.println(s.getArea());
		
		
		Circle c = new Circle();
		c.setRadius(10);
		System.out.println(c.getArea());

	}

}

class Shape{
	
	public double getArea()
	{
		return 0;
	}
}


class Square extends Shape{
	
	private int bianchang;
	
	public int getBianchang() {
		return bianchang;
	}

	public void setBianchang(int bianchang) {
		this.bianchang = bianchang;
	}

	@Override
	public double getArea() {		
		return this.bianchang * this.bianchang;		
	}
}

class Circle extends Shape{
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {		
		return 3.14 * this.radius * this.radius;		
	}

}