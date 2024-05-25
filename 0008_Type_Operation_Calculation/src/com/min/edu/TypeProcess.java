package com.min.edu;

public class TypeProcess {
	
	//맴버필드란?
	// 접근제한자를 가지고 있는 변수 , 선언하면 자동으로 default초기화
	//new 를 통해서 사용해야함
	
	public void calculation() {
		byte b1 = 127;
		byte b2 = 1;
		// 정수형의 연산은 int연산 단, long제외
		byte bsumb =(byte)( b1+b2); // -128
		int bsum = b1+b2;
		//casting연산자는 int의 크기에서 8bit제거하기떄문에
		//연산된 1000 0000 를 byte로 처리하면 1은 부호비트로 되기때문에
		// 결과는 음수인 0000 0000 
		//
		System.out.println(bsumb);
		System.out.println(bsum);
		
		float f = 10.0f;
		//나누기 연산시 casting연산자를 잘 사용하세요
		float fDiv = f/2;
//		float dDiv = 10f/2.0; 참여하는 2.0의 값은 double의 리터럴
		float dDiv = (float)(10f/2.0);
		
		float iDiv = 10/3;
		float iDivt = (float)(10/3);
	}
	
	public void floatValueConfirm() {
		//부동 소수점
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}
}
