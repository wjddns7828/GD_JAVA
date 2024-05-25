package com.min.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Step3 {
	//분모값이 0이면 발생되는 예외 클래스 : java.langArtimeticException / by zero
	//정수가 아닌 다른 값을 입력하면 예외 클래스 : java.util.InputMismatchException
	
	//MultiCatchBlock 
	//예외 발생 코드를 구체화 시켜서 작성하는 것
	//예외가 여러개 발생 되는 코드를 여러개의 Catch block을 통해서 작성하는것
	//Exception -> ArithmaticException, IllegalArgumentException
	//계층 구조  
	public int calculation() {
		int n = 0;
		//예외 발생 가능 영역을 try~catch로 작성
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수를 입력하소");
			n = scan.nextInt() / scan.nextInt(); // 예외 발생 가능 코드
			System.out.println("연산결과 : "+n);
		} catch (ArithmeticException e) {//ArithmeticException 과 InputMismatchException 동등 위치
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		catch (InputMismatchException e) {//예외처리 계층 구조에서 Runtime의 상위클래스
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return n;
	}
}
