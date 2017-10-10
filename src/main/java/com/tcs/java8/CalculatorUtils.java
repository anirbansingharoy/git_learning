package com.tcs.java8;

public class CalculatorUtils {
	
	public static int addTwoNumbers(int a,int b)
	{
		int c=a+b;
		
		if(c>10)
			throw new RuntimeException("Greater Than 10 ");
		return c;
	}

}
