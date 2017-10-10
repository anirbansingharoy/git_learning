package com.tcs.java8;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static junit.framework.Assert.*;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;



@RunWith(Parameterized.class)
public class EvenNumberTest {
	
	 private Integer inputNumber;
	   private Boolean expectedResult;
	
	@Parameterized.Parameters
	   public static List  primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, true },
	         { 6, false },
	         { 19, true },
	         { 22, false },
	         { 23, true }
	      });
	   }

	public EvenNumberTest(	Integer inputNumber,Boolean expectedResult) {
		this.expectedResult=expectedResult;
		this.inputNumber=inputNumber;
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Input is "+inputNumber);
		
		System.out.println("Expected Result  is "+expectedResult);
		
		//assertEquals(expectedResult, PrimeNumberChecker.isEvenNumber(inputNumber));
		
       assertThat(expectedResult,is(2));	

	}

}
