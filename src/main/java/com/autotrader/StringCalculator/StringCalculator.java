package com.autotrader.StringCalculator;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.asList;

import java.util.List;

public class StringCalculator {
	
	private static String delimiter = ",";
	private static String regex = "\\d+[\\s*[\\" + delimiter + "]{0,1}\\s*\\d*]*";

	public int calculateResult(String inputToSum) {
		
		if(isEmptyOrNull(inputToSum) || !validFormat(inputToSum)){
			return -1;
		}

		return splitAndSum(inputToSum);
	}
	
	private boolean isEmptyOrNull(String input) {
		return (null == input || "".equals(input));
	}

	private boolean validFormat(String input) {
		return input.matches(regex);
	}

	private int splitAndSum(String input){
		List<String> numbers = asList(input.split(delimiter));
		int result = 0;
		for (String number : numbers){
			result += parseInt(number);
		}
		return result;
	}
}
