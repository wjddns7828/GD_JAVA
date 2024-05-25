package com.edu.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DefineUtil {

	/*
	 * <b> java.util.scanner </b> 객체를 사용하여 키보드로 입력받은 값을 int로 반환하는 메소드 <br> 예외처리를 통한
	 * 정확한 값을 입력받을 수 있다.
	 * 
	 * @return 정수 범위의 값
	 */
	@SuppressWarnings("resource")
	public static int getNum() {
		int n;
		while (true) {
			n = 0;
			try {
				System.out.println("정수만 입력해 주세요");
				Scanner scan = new Scanner(System.in);
				n = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 타입의 값입니다. \n 재입력 해주세요 / " + e.getMessage());
				// e.printStackTrace();
			}
		}
		return n;
	}

	/*
	 * <b> java.util.scanner </b> 객체를 사용하여 키보드로 입력받은 값을 String으로 반환하는 메소드 <br> 한 줄의
	 * 값을 입력받아 앞뒤의 공백(Blank)를 제거하여 값만 반환하는 메소드
	 * 
	 * @return 문자열 값 It is a Unicode space character (<a href=
	 * 'https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/
	 * Character.html#SPACE_SEPARATOR'>SPACE_SEPARATOR</a>, <a
	 * href='https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/
	 * Character.html#LINE_SEPARATOR'>LINE_SEPARATOR</a>, or <a
	 * href='https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/
	 * Character.html#PARAGRAPH_SEPARATOR'>PARAGRAPH_SEPARATOR</a>) but is not also
	 * a non-breaking space ('\u00A0', '\u2007', '\u202F').
	 */
	@SuppressWarnings("resource")
	public static String getString() {

		String str = "";
		System.out.println("필요 값을 입력 해 주세요");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();

		return str.strip();
	}
	
	@SuppressWarnings("resource")
	public static String getAnswer(String msg) {
		String ans="";
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println(msg);
			ans = scan.nextLine().strip();
			if(ans.compareToIgnoreCase("Y")==0||
					ans.compareToIgnoreCase("N")==0) {
				break;
			}
		}
		return ans;
	}
}
