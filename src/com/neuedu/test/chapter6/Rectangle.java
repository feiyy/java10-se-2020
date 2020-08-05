package com.neuedu.test.chapter6;

public class Rectangle {

	int length;
	int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getArea() {
		return this.length * this.width;
	}

	public int getPer() {
		return (this.length + this.width) * 2;
	}

	public void showAll() {
		System.out.println(
				"��Ϊ��" + this.length + ",��Ϊ��" + this.width + ",���Ϊ��" + this.getArea() + ",�ܳ�Ϊ��" + this.getPer());
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(200,100);
		
		r1.showAll();
	}

}
