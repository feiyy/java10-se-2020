package com.neuedu.test.chapter7.copy;

/*
 *  ������ vs �ӿ�
 *  
 *  �����ࣺ ����  is a����
 *  �ӿڣ� ���� has�ӿڵ���Ϊ
   
 *  1�� �����������ԣ��ӿ�û�����ԣ������г�����
 * 
 * */


public class TestShape {
	
	public static void main(String[] args) {
		
		
		
	}

}


/*
 * �������п����г��󷽷���Ҳ�����зǳ��󷽷�
 * 
 * ע�⣺
 * 1) �����಻��new����, ������
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


