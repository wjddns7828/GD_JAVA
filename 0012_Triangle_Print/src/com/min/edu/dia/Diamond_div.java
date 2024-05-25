package com.min.edu.dia;

import java.util.Iterator;

//TODO 001 위/아래의 삼각형 역삼각형의 두개의 메소드를 통해서 다이아몬드 구현
public class Diamond_div {
	//생성자
	//클래스를 만들면 반드시 존재하는 default
	//클래스명과 같고 반환타입이 없는 메소드
	//외부에서 new를 통해 단 한번 호출되어 객체를 메모리에 생성해준다.
	public Diamond_div(int n) {
		System.out.println("Diamond의 생성자");
		printIncrease(n);
		printDecrease(n);
		printDecrease2(n);
	}
	private void printIncrease(int n) {

		for (int i = 0; i < n; i++) { //라인 찍기
			for (int j = 0; j < n-1-i; j++) { //공백 찍기
				System.out.print("　");
			}//공백
			for (int j = 0; j < i*2+1; j++) { // 다이아 찍기
				System.out.print("◆");
			}//그림
			System.out.println();
		}
	}

	private void printDecrease(int n) {

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("　");
			}
			for (int j = 0; j < 2*(n-1-i)+1; j++) {
				System.out.print("◆");
			}
			System.out.println();
		}//층
	}

	private void printDecrease2(int n) { //값을 핸들링 함
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("　");

			}
			for (int j = 1; j < 2*(n-1-i); j++) { 
				System.out.print("◆");				
			}
			System.out.println();
		}//층
	}
}
