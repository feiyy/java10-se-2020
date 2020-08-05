package com.neuedu.test.chapter4;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cs = {'n','e','u','s','o','f','t'};
		
		char[] copy = new char[cs.length]; 
		
		for(int i=0;i<cs.length;i++)
		{
			copy[i] = cs[i];
		}
		
		//Êä³öcopy
		for(char item: copy)
		{
			System.out.println(item);
		}

	}

}
