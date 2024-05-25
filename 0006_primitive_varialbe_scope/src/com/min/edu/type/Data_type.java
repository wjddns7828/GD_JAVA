package com.min.edu.type;

import java.util.ArrayList;

public class Data_type {
	
	//TODO 001 선안과 대입
	public void declaring_assignment() {
		int val; // 사용되는 타입의 변수명 선언(declaring)
		val = 10; // 선언된 변수에 값을 대입 (assignment)
		
		int newval = 10;//선언과 대입을 동시에 할 수 있다.
		System.out.println("선언된 변수명을 호출하면 입력된 값을 가져온다"+val);
	}
	//TODO 002 자바 기본 타입의 종류
	public void dataTypeKind() {
		//정수형 byte,shor,int,long
		//실수형 float,double
		//문자형 char
		//논리형 boolean
	}
	//TODO 003 정수 타입
	public void integerType() {
		byte b = 2; // -128 ~ 127
		short s = 1; // -32768 ~ 32767
		int i = 0; // 2^32
		long l = 10; // 2^64
		
		//리터럴 표기법
		int hex = 0xf; //hexadecimal =16진수
		int oct = 07 ; //octal = 8진수
		int bi = 0b01 ; //binary = 2진수 (1.7부터 사용되는 2진수 표기법)
		
		//금융권 사용 (빅넘버 표기법)
		
		int bicNumber = 1_000_000;
	}
	//TODO 004 실수 타입
	public void floatType ( ) {
		double d = 3.14; 
		double d2 = 3e2; //지수 표기법 = 10^2 =300
		
		//java에서 실수는 항상 갑을 double을 가짐
		//따라서 float타입을 선언하여 값을 입력 경우는 리러털 처리를 해줘야한다
		//접미어 f , ㄹ
		
		float f = 0.11f;
		double d3 = 3.11;
		float fc = (float)d3;// d3를 float으로 바꿔주세요<< 라는 뜻 괄호는 캐스팅(casting) 연산자
	}
	
	//TODO 005 문자형(Unicode Charchter)
		public void charType() {
			//문자형의 선언은 '(single quote)를 통해서 값을 선언한다
			char a = 'a';
			char b = 66;
			char c = '\u0044';//리터럴
		}
		
		//TODO 006 논리형 (자바에서는 true/false의 예약어로만 사용 가능)
		public void booleanType() {
			boolean isc1 = true;
//			boolean isc2 = 0; // 따라서 다른 언어와 다르게 논리값과 연신이 되지않는다.
			
			//## & , && 차이: &는 이진법으로 비교함 즉 3&3 = 3 // 			
		}
		
		//TODO 007 var타입
		//java 10 로컬변수는  var로 선언하여 컴파일러가 할당에 따라서 변수 유형을 자동으로 결정하도록 함
		//1) var타입은 로컬변수만 가능하다
		//2) var타입은 사용하고 사라짐 (메모리 효율을 위해서)
		public void varType() {
			//다음 두 선언은 동일합니다.
			var i1 = 5;
			int i2 =5;
			System.out.println(i1);
			System.out.println(i2);
			//할당된 변수의 유형이 분명한 경우 선언을 줄이고
			//가독성을 높이기 위하여 var를 사용하는것이 좋음
			ArrayList jmt = new ArrayList();
			var mt = new ArrayList(); //이런식으로 가능
		}
}
