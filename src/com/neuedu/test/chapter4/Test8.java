package com.neuedu.test.chapter4;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 1, 3,5,3};
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j] = 0;
				}
			}
		}
		
		for(int item : arr)
		{
			System.out.println(item);
		}
	}

}
