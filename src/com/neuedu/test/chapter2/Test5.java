package com.neuedu.test.chapter2;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* \r 回到行首
		 * \n 换行 
		 * 
		 * 在eclipse工具中，两个效果一样
		 * 
		 * \b退格
		 * 
		 * 在eclipse工具中，测试不出来。
		 * 
		 * 
		 * 0-9: 十进制48
		 * A-Z: 十进制65
		 * a-z: 十进制97
		 * 
		 */
		char a = 'a';
		char b = '中';
		char c = '\u9FA5';
		char d = '\t';
		char e = '\'';
		char f = '\\';
		String g = "\"";
		
		System.out.print(a);
		System.out.print(b);
		System.out.print('\b');
		System.out.print(d);
		System.out.print(c);
		System.out.print('\r');
		System.out.print(e);
		System.out.print(f);
		System.out.println(g);
		
		System.out.println("escape\\bchar");
	    System.out.println("escape\\tchar");
	    System.out.println("escape\\rchar");
	    System.out.println("escape\\nchar");
	    System.out.println("\\我在斜线里\\");
	    System.out.println("'我在单引号里'");
	    System.out.println("\"我在双引号里\"");
	    System.out.println("我没有双引号");
	    
	    boolean flag = true;
	    boolean flag2 = false;
		

	}

}
