package com.min.edu.api;

public class UserDefineCharacter {
	public static int getNumericValue(char c) {
		int result = 0;
		//문자형 정수형 범위
		// 0 == 48  / 9 == 57
		if(c>=48 && c<=57) {
			result = c - 48;
			return result;
			
		}else {
			result=777;
		}
		return result;
	}
}
