package com.neuedu.test.chapter6;

import java.util.Scanner;

public class TestStudent {
	
	public static void main(String[] args) {
		//����һ������
		Student[] stus = new Student[5];
		
		for(int i=0; i<stus.length;i++)
		{
			//�����û�����
			//Scanner��bug,
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�������"+(i+1)+"��ѧ������Ϣ ");
					
			String name = sc.nextLine();
			int sno = sc.nextInt();
			double score = sc.nextDouble();
			
			stus[i]=new Student(name,sno,score);
		}
		
		//����������
		for(int i=1; i<stus.length;i++)
		{
			for(int j=0; j<stus.length-i;j++)
			{
				if(stus[j].score<stus[j+1].score)
				{
					Student temp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp;					
				}
			}
		}
		
		//�����ǰ��ճɼ��������е�
		for(Student item : stus)
		{
			System.out.println(item.name + "\t" + item.score);
		}
		
	}

}

class Student{
	
	String name;
	int sno;
	double score;
	
	public Student(String name, int sno, double score)
	{
		this.name = name;
		this.sno = sno;
		this.score = score;
	}	
}
