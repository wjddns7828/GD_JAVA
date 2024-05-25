package com.min.edu.sand;

public class Sand_div {
	public Sand_div(int n) {
		System.out.println("모래시계 생성자");
		printDecrease(n);
		printIncrease(n);
		
	}
	private void printIncrease(int n) {

		for (int i = 1; i < n; i++) { //라인 찍기
			for (int j = 0; j < n-1-i; j++) { //공백 찍기
				System.out.print("　");
			}//공백
			for (int j = 0; j < i*2+1; j++) { // 그림 찍기
				System.out.print("◆");
			}//그림
			System.out.println();
		}
	}

	private void printDecrease(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("　");
			}
			for (int j = 0; j < 2*(n-1-i)+1; j++) {
				System.out.print("◆");
			}
			System.out.println();
		}//층
	}
}
