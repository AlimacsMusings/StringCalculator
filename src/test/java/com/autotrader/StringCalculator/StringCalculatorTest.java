package com.autotrader.StringCalculator;

import org.junit.Assert;
import org.junit.Test;


public class StringCalculatorTest {
	
	@Test
	public void shouldCalculateSingleDigitResult() {
		StringCalculator stringCalculator = new StringCalculator();
		Assert.assertEquals(3, stringCalculator.calculateResult("3"));
	}
	
}
