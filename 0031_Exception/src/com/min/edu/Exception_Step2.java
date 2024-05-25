package com.min.edu;

import java.util.Scanner;

public class Exception_Step2 {
	//분모값이 0이면 발생되는 예외 클래스 : java.langArtimeticException / by zero
	//정수가 아닌 다른 값을 입력하면 예외 클래스 : java.util.InputMismatchException
	public int calculation() {
		int n = 0;
		//예외 발생 가능 영역을 try~catch로 작성
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수를 입력하소");
			n = scan.nextInt() / scan.nextInt(); // 예외 발생 가능 코드
			System.out.println("연산결과 : "+n);
		} catch (Exception e) {//예외처리 계층 구조에서 Runtime의 상위클래스 VMI
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		return n;
	}
}
