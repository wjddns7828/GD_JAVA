package com.min.edu;

/**
 * 클래스 
 * 열거식 혹은 열거형 나열기법
 * 열거형은 명명된 상수의 고정 목록으로 구성된 유형
 * 1) enum클래스
 * 2) 이름과 상수 요소를 쉼표로 구분된 코드블럭 작성
 * 
 * 열거형에 대한 액세스 수준은 클래스와 동일
 * 패키지는 기본적으로 비공개지만 동일한 이름의 파일에 선언된 경우 공개로 설정 할 수 있음
 * 
 * 
 * 
 */
public class Enum_Main {

	public static void main(String[] args) {
		//1. Enum타입은 static과 같은 방법을 사용 함
		// 하지만 변수의 타입은 반드시 Enum 타입이여야함

		Speed s = Speed.SLOW;
		//Switch Case 문은 key와 value가 같은 타입이여야 함
		switch(s) {
		case STOP:System.out.println("멈춤");break;
		case SLOW:System.out.println("천천히");break;
		case NORMAL:System.out.println("보통");break;
		case FAST:System.out.println("빠름");break;
		}
		SpeedValue sv = SpeedValue.NORMAL;
		System.out.println(sv.velocity);
		
		SpeedValue[] a = SpeedValue.values();
		String sName = a[0].toString();
		System.out.println(sName);
		
		SpeedValue b = SpeedValue.valueOf(sName);
		System.out.println(b);
		
		
	}
	(x,y)->x+y;
	
}
