package com.neuedu.test.chapter10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Test6 {
	
	//35 ѡ 7
	//hashset�洢λ����hash�㷨����
	//treeset�ڲ���������
	public static void main(String[] args) {
		
		Random r = new Random();
		
		TreeSet set = new TreeSet();
		
		while(set.size()<7)
		{
			//����1-35
			int num = r.nextInt(35)+1;
			set.add(num);
		}
		
		//��ӡ7����
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			Object o = iter.next();
			System.out.println(o);
			
			//��������
		}
		
		//����ð������
	
	}

}
