package com.neuedu.test.chapter4;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{1,2,3,6,8,7} => {7,8,6,3,2,1}
		
		int[] arr = {1,2,3,6,8,7};
		
		for(int i=0; i<arr.length/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		
		//��ӡ
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}

	}

}
