package com.autotrader.StringCalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;


public class StringCalculatorTest {
	
	StringCalculator stringCalculator;
	
	@Before
	public void setUp(){
		stringCalculator = new StringCalculator();
	}
	
	@Test
	public void shouldCalculateSingleDigitResult() {
		assertThat(stringCalculator.calculateResult("3")).isEqualTo(3);
	}
	
	@Test
	public void shouldCalculateNullResult() {
		assertThat(stringCalculator.calculateResult(null)).isEqualTo(-1);
	}
	
	@Test
	public void shouldCalculateEmptyResult(){
		assertThat(stringCalculator.calculateResult("")).isEqualTo(-1);
	}
}
