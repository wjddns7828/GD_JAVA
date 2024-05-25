package com.min.edu.dia;

import java.util.Iterator;

/**
 * TODO 002 조건을 가지고 중간 기점에서 증가/감소하여 반복의 횟수를 제어하자
 * 1) if문과 3항 연산자는 호환되지 않습니다.
 * 2) 반환은 단 1회만 된다.
 * 3) 기능은 반드시 분리하여 메소드를 작성한다.
 * @author GDJ67
 *
 */
public class Diamond_If {
	static int j2 = 0; // 중간 지점과 현재 Index의 값을 판단하여 증가 혹은 감소 class의 전체 변수
	
	public static void dia_if(int stage) {

		
		//중간 지점 변수 만들기
		int mid = stage/2;
		
		for (int i = 0;  i < stage; i++) {
			for (int j = 0; j < mid - j2; j++) { //공백
				System.out.print("@");
			}
			for (int j = 0; j < j2*2+1; j++) { //그림
				System.out.print("★");
			}
			System.out.println();
			//1) 변화하는 층수(i)와 중간층 (mid) 판단하여 j2의 증감을 만들어 냄
//			if(i<mid) {
//				j2++;
//			}else {
//				j2--;
//			}
			
			//2) 삼항연산자
			//j2 = (i<mid)?j2++:j2--;
			//int x = (i<mid)?j2++:j2--;
			//j2 = (i<mid)?++j2:--j2;
			
			//3) 기능을 분리하여 작성한다
			
			Check_mid(i, mid);
			
			
		}//층수 for문
	}

	private static int Check_mid(int i, int mid) {
		
		return (i<mid)?j2++:j2--;
	}
}
