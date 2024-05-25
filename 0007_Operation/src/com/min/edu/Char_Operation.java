package com.min.edu;

public class Char_Operation {
	// char는 리터럴 3개를 가지고 있음
	// 기본 표현값, 유니코드값, 정수(int)값
	
	public static void main(String[] args) {
		char c1 = 'A';//A
		char c2 = 65;//A

		System.out.print("코코아");
		System.out.print("야무짐");
		//formating 방식 , %s문자,%d숫자,%f실수 값을 바인딩 한다
		System.out.printf("%s와%s를%d배 맛있다","커피","복숭아티",2);
		//java => Escape문자 | HTML>> entity tag 
		System.out.println("\"코코아\"\t맛이\n따");
		
		
		System.out.println(c1); //기본값
		System.out.println(c2); // int 값
		String s = Integer.toHexString(c1);
		System.out.println(s);
		char c3 = '\u0041';
		System.out.println(c3);
		
		//TODO 001 Casting과 Promotion
		//Casting은 특정 형태로 강제로 변경하는 작업
		//ex)double d = 3.11; int i = (int)d;
		//Promotion은 Casting연산자를 사용하지않고 변경되는 작업
		//ex) int a = 10 , long l = a;
		int idxA = 65;
		char c4 =(char)idxA;
		System.out.println(c4);
		int c5 =c4; 
		
		char c6 = (char) (c4 +1);
		System.out.println(c6);
		
		int c7 = 'A'-0;
		
		
	}
}
