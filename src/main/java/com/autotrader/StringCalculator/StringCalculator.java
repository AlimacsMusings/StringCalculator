package com.autotrader.StringCalculator;

import java.util.StringTokenizer;

public class StringCalculator {

	private int result;

	
	public int calculateResult(String input) {
		
		if(isInvalidInput(input)) {
			return -1;
		}
		
		if(input.contains(",")) {
			
			StringTokenizer st = new StringTokenizer(input, ",", false);
			int total = 0;
			while(st.hasMoreTokens()){
			
				if(isNotANumber(st.nextToken())){
					return -1;
				}
				total = total + result;
			}
			return total;
		}
		
		if(isNotANumber(input)){
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
