package com.min.util;

import java.util.Scanner;

public class inputUtil {

	public static int inputNum() {
		int n = 0;
		System.out.println("정수를 입력해 주세요");
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				n = scan.nextInt();
			}
			catch (Exception e) {
				//			e.printStackTrace();
				System.out.println("숫자만 입력해 주세요");		
			}
			return n;
		}					
	}
}
