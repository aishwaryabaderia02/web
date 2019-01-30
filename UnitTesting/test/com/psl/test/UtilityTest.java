/*
 * annotate with test for unit testing
 * include j unit test library from build path
 * runners package provide runners to execute test methods
 * method annotated with before will be called before every test methods 
 * After is complimentary method of before executed after test methods are executed
 * Before class and after class method would be called just once
 * Test method has two attribute 1.expected 2.timeout
 */
package com.psl.test;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.psl.util.Utility;

	
public class UtilityTest {
	
	
	private static Utility utility;
	
	@Before    //or @BeforeClass
	public static void setupForTestMethod(){
		utility = new Utility();
	}

	@After    //or @AfterClass
	public static void cleanupAfterTestMethod(){
		
	}
	
	@Test(expected = SQLException.class)        //at some point it must throw SqlException as failure
	public void testFactorial_1(){
		int number = 3;
		long expectedResult = 6 , actualResult;
		
		actualResult = utility.factorial(number);
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testFactorial_2(){
		int number = 7;
		long expectedResult = 5040 , actualResult;
		
		actualResult = utility.factorial(number);
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testFactorial_3(){
		int number = 5;
		long expectedResult = 120 , actualResult;
		
		
		actualResult = utility.factorial(number);
		
		Assert.assertEquals(expectedResult, actualResult);
	}
}
