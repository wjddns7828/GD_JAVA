package com.min.seq;

public class AntSeq_Process {
	
	public void ant_Iterator(int stage) {//11
		String val = "1";
		System.out.println(val);
		for (int i = 0; i < stage-1; i++) {
			val = process(val);
			System.out.println(val);
		}		
	}
	/**
	 * @param x 처음 시작하는 개미수열의 값 문자열 "11";
	 */
	public String process(String x) {
		String result = "";
		int count = 1;//자신의 갯수 1개는 기본으로 가지고 있음
		char initValue = x.charAt(0);//비교 할 대상 첫번쨰 초기값
		for (int i = 1; i < x.length(); i++) {
			if(initValue==x.charAt(i)) {
				count++;
			}else {
				result = result+initValue+count;
				initValue = x.charAt(i);
				count = 1;
			}//if / else
		}//for
		result = result+initValue+count;
//		System.out.println("다음 층의 수열 값 : " +result);
		return result;
	}
}
