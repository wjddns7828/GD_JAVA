package com.min.edu.dia;

import java.util.Iterator;

// 메소드 분리
public class Diamond_Seperate {
	
	//전체 층수 
	static int n =5;
	
	//층수만 입력해주는 메소드
	public static void StageInput() {
		for (int i = 0; i < n; i++) {
			drawImage(i);
		}
		for (int i = n; i > 0 ; i++) {
			drawImage(i);
		}
	}
	//그림만 그려주는 메소드
	public static void drawImage(int i) {
		for (int j = 0; j < n-i ; j++) {
			System.out.print("○");
		}
		for (int j = n; j < (2*i)-1; j++) {
			System.out.print("●");
		}
		System.out.println();
	}
}
