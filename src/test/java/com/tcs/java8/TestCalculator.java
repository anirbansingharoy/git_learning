package com.tcs.java8;

import org.junit.Test;

import junit.framework.Assert;



public class TestCalculator  {
	
	@Test
	public void  WhenTwoNumbersPassedAddthem()
	{
		Assert.assertEquals(4, CalculatorUtils.addTwoNumbers(2, 2));
	}
	
	@Test(expected=RuntimeException.class)
	public void WhenAddResultisGreaterThanTwoDigitThrowRuntimeException()
	{
		CalculatorUtils.addTwoNumbers(2,2);
	}

}
