package com.neuedu.test.chapter6;

public class TestLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop t1 = new Laptop();
		System.out.println(t1);
		Laptop t2 = new Laptop('r',10);
		System.out.println(t2);
		
		t1.showInfo();
		t2.showInfo();

	}

}

class Laptop{
	
	char color;
	int brand;
	
	public Laptop()
	{
		this('g',200);
	}
	
	public Laptop(char color, int brand)
	{
		this.color = color;
		this.brand = brand;
	}
	
	public void showInfo()
	{
		System.out.println("��ɫΪ��"+this.color+",�ͺ�Ϊ��"+this.brand);
	}
	
}
