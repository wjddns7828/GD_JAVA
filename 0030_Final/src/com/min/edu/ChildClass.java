package com.min.edu;

import java.util.Arrays;

//FinalClass가 extends 가능한 클래스이다.
//만약 FinalClass가 final로 작성되어 있다면 extends 문법 오류가 발생
public class ChildClass extends FinalClass {
	public ChildClass() {
		parentUserMethod();
	}
	private void parentUserMethod() {
//		ARR = null; final이라서 재입력 불가
//		AGE = 12;  final이라서 재입력 불가
		
		change();
		
		ARR[0] = 100;
		int[] copyArr = getArr();
		copyArr[0] = 999;
		
		System.out.println("원본 : "+Arrays.toString(ARR));
		System.out.println("복사본 : "+Arrays.toString(copyArr));
	}
	
	@Override
	public String callMethod() {
		
		return "나는 자식";
	}
	
	

}
