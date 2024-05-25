package com.min.edu;

//TODO 001 기본타입은 java프로그램에서 제공해주는 기본 값이다.
public class Primitive_Exchange {
	public static void main(String[] args) {
		//기본타입 4가지 : 정수형 실수형 문자형 논리형
		//TODO 001_01 기본타입의 형변환
		//1) 값의 크기에 대한 형 변환
		//2) Type의 형 변환
		//용어 :
		// Promotion : 자동으로 값이 다른 형태로 변경되는 것
		// Casting : casting연산자를 통해서 값의 손실을 감수하고 타입을 변경함
		
		//casting
		int a =256; //byte, short < int < long
		byte b = (byte)a; //casting연산자다 강제로 바꿈
		System.out.println("int 100이 변경된 byte값:"+b);
		
		int max = Integer.MAX_VALUE;
		long l = max+1L;
		System.out.println("int 100이 변경된 long값:"+l);

		double d1 = 3.14;
		float f1 = (float)d1;
		System.out.println("Double은 Float으로 크기의 형변환이 일어날 때 Casting 연산자를 사용 해줘야 한다"+f1);
		
		//promotion
		//같은 타입 일 때는 작은 -> 큰 크기로 자동으로 변경
		int i1=100;
		long l1=i1; //promotion
		
		float f2 = 3.33f;
		double d2 = f2;// promotion
		
		double d3 = 4.44;//8byte
		long l3=(long)d3; //8byte
		int i2 = (int)d3;//4byte
		
		int solution = (int)(long)d3;
		
		double d5 = 1.01;
		float f5 = 1.01f;
		
		//실수부를 버려야 하기 떄문에 반드시 casting연산자를 사용해야함
//		long l5 = d5;
//		int i5 = d5;
//		byte b5 = d5; 
		
		byte b6 = 127;
		int i6 = 1000;
		long l6 = 2000;
		
		float f6 = b6; //byte 1 
		f6=i6;//byte4
		//long의 크기가 정수에서는 8byte지만 float의 4byte로 형태가 변경 될시 promotion으로 동작된다.
		f6=l6;//byte8
		
		//char 3가지의 리터럴 : 'A' , int (code point, index)  ,'/uXXXX' <<유니코드
		char c1 ='A';
		char c2 = 65; //리터럴의 정숙밧
		char c3 = '\u0401';
		
		int i3 =65;
		char c4 = (char)i3;//변수에 담겨있는 정수값은 반드시 casting연산자를 사용해야함
		
		int i4=c4; //char는 가질 수 있는 정수 값이 있음 
		byte i5 = (byte)c4;//char눈 가질 수 있는 정수값을 int의 크기로 가지고 있음
			//'A' = promotion => int 65 =Casting=> byte 65
		
		
		
		
	}
	
}
