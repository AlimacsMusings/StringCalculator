package com.autotrader.StringCalculator;

public class StringCalculator {

	
	private int result;

	public int calculateResult(String input) {
		
		if(isInvalidInput(input)){
			return -1;
		} 
		
		if (isaANumber(input)) {
			return result;
		}
		return -1;
	}

	private boolean isInvalidInput(String input) {
		return (input == null || "".equals(input));
	}
	
	private boolean isaANumber(String input){
		
		try {
			result = Integer.parseInt(input);
			
		} catch (NumberFormatException nfe){
			return false;
		}
		return true;
	}
}
