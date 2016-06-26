package com.autotrader.StringCalculator;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringCalculator {
	
	private static String regex = "\\d+";
	private static String delimiter = ",";
	private int result;
	
	public int calculateResult(String input) {
		
		if(isEmptyOrNull(input)){
			return -1;
		}
		
		if(!checkTokens(input)) {
			return -1;
		}

		return result;
	}
	

	private boolean checkTokens(String input) {
		StringTokenizer st = new StringTokenizer(input, delimiter, false);
		Pattern pattern = Pattern.compile(regex);
		String token;
		while(st.hasMoreTokens()){
			token = st.nextToken().trim();
			if(!pattern.matcher(token).matches()){
				return false;
			}
			add(token);
		}
		return true;
	}
	
	private void add(String token){
		result = result + Integer.parseInt(token);
	}


//	private int sumTokens(String input) {		
//		StringTokenizer st = new StringTokenizer(input, delimiter, false);
//		int result = 0;
//		String token;
//		while(st.hasMoreTokens()){
//			token = st.nextToken().trim();
//			result = result + Integer.parseInt(token);
//		}		
//		return result;
//	}
	
	
	private boolean isEmptyOrNull(String input) {
		return (null == input || "".equals(input));
	}
	
}
