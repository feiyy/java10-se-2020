package com.neuedu.test.chapter2;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean x = false;
		boolean y = true;
		
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		System.out.println(x^y);//相同为false, 不同为true //true
		
		System.out.println("=======================");
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		//&& || 短路运算
		boolean flag1 = a>b && b++<c; //true
		
		System.out.println(b);
		
		boolean flag2 = a<b || b++>c; //true
		
		System.out.println(b);
		

		System.out.println("=======================");
		//& | 不短路
		
		int x1 = 200;
		int y1 = 300;
		int z1 = 400;
		
		
		boolean b1 = x1>y1 & y1++ <z1;
		
		System.out.println(y1);
		
		System.out.println("=======================");
		//三元运算符
		
		char sex = 'M';
		
		
		String str = sex=='F'?"女":"男";
		
		System.out.println(str);
		
		
		int xx = 10;
		int yy = 20;
		int zz = 30;
		
		int max = xx>=yy?xx:yy;
		
		max = max>=zz?max:zz;
		
		System.out.println(max);

	}

}
