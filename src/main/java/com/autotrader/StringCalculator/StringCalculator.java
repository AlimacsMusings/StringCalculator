package com.autotrader.StringCalculator;

public class StringCalculator {

	private int result;

	
	public int calculateResult(String input) {
		
		if(isInvalidInput(input) || isNotANumber(input)) {
			return -1;
		}
		return result;
	}

	
	private boolean isInvalidInput(String input) {
		return (null == input || "".equals(input));
	}
	
	
	private boolean isNotANumber(String input){
		
		try {
			result = Integer.parseInt(input);
			
		} catch (NumberFormatException nfe){
			return true;
		}
		return false;
	}
}
