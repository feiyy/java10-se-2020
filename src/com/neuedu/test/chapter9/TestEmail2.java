package com.neuedu.test.chapter9;

public class TestEmail2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aC8_-@neusoft.com.cn";
		
		String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
		
		System.out.println(str.matches(regex));

	}

}
