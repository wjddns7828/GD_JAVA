package com.min.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Step5 {
	//분모값이 0이면 발생되는 예외 클래스 : java.langArtimeticException / by zero
	//정수가 아닌 다른 값을 입력하면 예외 클래스 : java.util.InputMismatchException
	
	//MultiCatchBlock 
	//예외 발생 코드를 구체화 시켜서 작성하는 것
	//예외가 여러개 발생 되는 코드를 여러개의 Catch block을 통해서 작성하는것
	//Exception -> ArithmaticException, InputMismatchException
	//계층 구조  
	public int calculation() {
		int n = 0;
		//예외 발생 가능 영역을 try~catch로 작성
		Scanner scan = null;
			try {
				scan = new Scanner(System.in);
				System.out.println("정수를 입력하소");
				n = scan.nextInt() / scan.nextInt(); // 예외 발생 가능 코드
				System.out.println("연산결과 : "+n);
			} catch (ArithmeticException | InputMismatchException e) {
				// 기존의 multi~catch block은 상위 하위 계층을 통해 처리가 가능했음 
				//업데이트 된 (1.7) multi~catch block은 동등 계층에서만 처리 가능함
				e.printStackTrace();
			}
			
			finally {
				//연산에 참여하는 객체를 닫아 줄 때 사용
				scan.close();
				System.out.println("연산의 성공여부와 관계없이 실행되는 영역 finally");
			}
			System.out.println(scan);

		return n;
	}
}
