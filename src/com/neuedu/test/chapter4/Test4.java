package com.neuedu.test.chapter4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,22,3,56,34,78,21};
		
		for(int i=1; i<arr.length;i++) //i比较趟数 
		{
			for(int j=0; j<arr.length-i;j++) //j比较次数
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//打印结果
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
