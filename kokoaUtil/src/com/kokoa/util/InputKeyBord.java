package com.kokoa.util;

import java.util.Scanner;

/**
 * 수업에서 사용 할 키보드에서 입력받는 값을 처리해주는 유틸리티 클래스
 * @author LJW
 * @since 23/04/21
 * @version 1.0v
 */

public class InputKeyBord {
	/**
	 * 키보드를 통해서 정수값을 반환받아 반환하는 메소드
	 * @return 키보드에서 입력된 정수 int
	 */
	public static int inputInteger() {
		int m = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수값을 입력해주세요");
		m=scan.nextInt();
		return m;
		
		
	}
}
