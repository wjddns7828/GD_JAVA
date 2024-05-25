package com.min.edu;

public class Arithmatic_Operation {
	//TODO 001 수학연산
	
	public void math () {
		//자바의 연산의 특징 : 정수 연산의 결과는 모두 정수 값은 int
		// d예외적으로 참여하는 정수의 크기가 long 결과도 long이 됨
		int a = 3;
		byte b =2;
		//float x= 3+2;
		float x = a+b;
		
		byte b1 = 2;
		byte b2 = 2;
		int bsum = b1+b2;
		
		short s1 = 10;
		long l1 = 1;
		long lsum = s1+l1;
		
		x= 3-1; //subtraction2
		x= 3*2; //6
		x= 3/2; //1
		x= 3&2; //1
		
		System.out.println();
	} //math
	
	public void division_sign() {
		// 실수연산의 경우는 잘못된 결과를 가져오는 경우가 많다
		// 참여하는 연산의 타입에 따라서 결과가 결정됨
		long calL= 10/5;
		
		
		float x1 = 3/2f; // 1.0
		System.out.println(x1);
		
		float x2= 3/2.0f; //1.5
		float x3= (float)3/2; //1.5
		float x4= 3/(float)2;//1.5
		float x5= (float)(3/2);//1.0 <<연산된 결과를 바꾸기 때문에 1.0나옴		
		
	}
}
