package com.min.edu.word; //첫번째, 패키지, 소문자, 클래스의 물리적인 위치

import java.util.Date; //import 외부패키지의 클래스를 사용시 어떠한 곳의 클래스를 사용하는지 명시적으로 나타냄
						//java.lang 패키지의 클래스는 암묵적인 import
						//java.util.*의 문법은 *(wild card) 자바의 유틸에 모든 클래스를 import하겠다는 것

public class DTO { //명칭 : class(클래스) 구성 : 접근 제어자 / 클래스 / 클래스 명 / {코드블럭} : Codeblock 안에는 맴버라고 한다
	
	//맴버필드 영역// : 접근제한자 / 타입 , 
				// 선언만 하여도 자동으로 default 값으로 초기화된다. heap영역
	public String name;  //명칭 : instance 변수 혹은 class 변수 / 외부에서 class를 new 했을 경우 사용 할 수 있는 변수
	
	public static String hobby; //static변수 new를 안해도 되고 class명.맴버로 사용 가능, 클래스 명만 사용한다면 접근 및 수정이 가능, 
								// 단 한번 생성된다
	//-------------//
	
	//생성자(constructor)// : 클래스를 만들면 자동으로 생성되는 반환타입이 없는 메소드
						// 클래스 명과 메소드명이 같다.
						// 외부에서 new를 통해 생성자를 호출하고 객체를 메모리에 할당하는 역활을 함
	public DTO() {
	}
	//----------------//
	
	//맴버 메소드// :접근 제한자 / [static], [final] / 반환타입/ 메소드명[(argument, parameter])
	public void make (int n) { //arguments 는 외부에서 넣어줘야 하는 값, parameter는 메서드 내부에서 값을 호출 할 이름
		int a = n; //local var 메소드 내부에서만 사용하고 사라짐
		new Date(); //다른 패키지에 있는 클래스를 생성한 것. 외부이기 때문에 import되어야 한다
		new java.sql.Date(2023);//먼저 import 된 같은 클래스가 있다면, 소스파일 내부에 명시적으로 package가 작성된다
	}
	//-----------//
}
