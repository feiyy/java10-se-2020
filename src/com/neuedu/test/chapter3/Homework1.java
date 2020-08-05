package com.neuedu.test.chapter3;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x,y;
		for (y=1,x=1;y<=50;y++){
			if(x>=10)
			    break;
			if(x%2==1){
			    x+=5;
			    continue;
			}
			 x-=3;
			}
		
		System.out.println(y);*/
		
		/*int a = 4, b=1, x=6;
		
		if(a==b)
			x+=a;
		else
			x=++a*x;
		
		System.out.println(x);*/
		
		/*int i = 0, j = 5;
	    tp: for (;;) {
	        i ++;
	        for(;;)
	        {
	        	  if(i > --j)  
	        	  {
	        		  break tp;
	        	  }
	  	         
	        }
	                 
	    }
	     System.out.println("i = " + i + ", j = "+ j);*/
		
		/*int sum = 0;
	    for (int i = 1; i <= 10; i++) {
	        if (i % 2 != 0)
	            continue;
	        else
	            sum += i;
	    }
	    System.out.println("和为：" + sum);*/
		
		
	/*	int i=0,total=0;
		do{
		i=i+2;
		System.out.println("i="+i);
		total=total+(i++)*2;
		}while(i<12);
		System.out.println("总数为："+total);*/
		
		/* int i = 3, j;
		    outer: while (i > 0) {
		        j = 3;
		        inner: while (j > 0) {
		            if (j < 2)
		                break outer;
		            System.out.println(j + "and" + i);
		            j--;
		        }
		        i--;
		    }*/
		
		 int n = 10;
		    for (int i = 1; i <= n; i++) {
		        if (n % i != 0)
		        continue;
		        System.out.print(i + ",");
		    }

	}

}
