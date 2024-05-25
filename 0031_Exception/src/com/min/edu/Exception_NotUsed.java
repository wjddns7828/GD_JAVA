package com.min.edu;

import java.util.Scanner;

public class Exception_NotUsed {
	public int calculation() throws UserDefineException {
		int n = 0;
		try {
			Scanner scan = new Scanner(System.in);
			n = scan.nextInt();
		} catch (Exception e) {
//			throw new NullPointerException();
			throw new UserDefineException("값이 이상합니다.");
		}
		return n;
	}
}
