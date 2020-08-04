package com.neuedu.test.chapter10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Test6 {
	
	//35 选 7
	//hashset存储位置由hash算法决定
	//treeset内部是排序树
	public static void main(String[] args) {
		
		Random r = new Random();
		
		TreeSet set = new TreeSet();
		
		while(set.size()<7)
		{
			//生成1-35
			int num = r.nextInt(35)+1;
			set.add(num);
		}
		
		//打印7个数
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			Object o = iter.next();
			System.out.println(o);
			
			//放数组里
		}
		
		//数组冒泡排序
	
	}

}
