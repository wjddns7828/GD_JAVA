package com.min.edu.ant;

public class AntQuiz {
	public void antQuizeiterator(int stage) {
		String val = "11";
		System.out.println(val);
		for (int i = 1; i < stage; i++) {
			val = antProcess(val);
			System.out.println(val);
		}		
	}	
	private String antProcess(String x) {
		String result = "";
		int count = 1;
		char initValue = x.charAt(0);
		for (int i = 1; i < x.length(); i++) {
			if(initValue==x.charAt(i)) {
				count++;
			}else {
				result = result+initValue+count;
				initValue = x.charAt(i);
				count = 1;
			}
		}
		result = result+initValue+count;
		return result;
	}
}