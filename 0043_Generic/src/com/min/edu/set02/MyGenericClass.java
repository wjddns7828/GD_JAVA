package com.min.edu.set02;


//TODO 004
//Generic 메소드 / 생성자 정의 및 사용

public class MyGenericClass {
	private String s;
	public <T> MyGenericClass(T t){
		s = t.toString();
	}
	
	
	public String getS() {
		return s;
	}
	
	//모든 타입의 Array를 출력 해 주는 제네릭 메소드
	public static <T> void printArray(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}
}
