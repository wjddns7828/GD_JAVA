package com.min.edu.sample;

public class Exam {
	//char 숫자를 -> int 숫자로 변경
	// '9' -> 9 / '0' -> 0
	public void charnumToNum() {
		char a = '9'; // 57
		int b = a; //
		System.out.println(b);
		int result = b-48;
		System.out.println(result); 
		
		// 1차원 적인 생각
		
		
		char z = '0';
		int cal = a-z;
		System.out.println(cal);
		
		int cal2 = '0' -b;
		System.out.println(cal2);
		
	}
	
	//'A' -> 'Z'
	public void charTochar() {
		char charA = 'A'; //65
		char charZ =  'Z'; // 90
		int result = charZ-charA;
		//풀이
		System.out.printf("A의 정수값: %d / Z의 정수값 : %d\n" ,(int)charA,(int)charZ);
		charA=(char)(charA+Math.abs(charA-charZ));
		System.out.println("변경된 :"+charA);
	}
	
	//123번에 있는 Unicode값을 출력하세요
	public void charIndex() {
		char a = 123;
		System.out.println(a);
	}
	//
	
	
	
	
}
