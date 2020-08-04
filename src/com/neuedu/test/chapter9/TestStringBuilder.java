package com.neuedu.test.chapter9;

import java.util.Scanner;

public class TestStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<3;i++)
		{
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			//追加
			builder.append(str+"-");
		}
		
		//删除最后一个-
		builder.deleteCharAt(builder.length()-1);
		
		System.out.println(builder);
	}

}
