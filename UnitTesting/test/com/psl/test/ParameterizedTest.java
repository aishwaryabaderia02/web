package com.psl.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.psl.util.Utility;

@RunWith(value=Parameterized.class)
public class ParameterizedTest {
	private int number ;
	private long expectedResult , actualResult;
	
	
	public ParameterizedTest(int number, long expectedResult) {
		super();
		this.number = number;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection<Number[]> dataValues(){
		Number[][] data = { {3, 6L}, {5, 120L}, {7, 5040L} };
		
		return Arrays.asList(data);
		
	}
	@Test
	public void testFactorial(){
		Utility utility = new Utility();
		actualResult = utility.factorial(number);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
}
