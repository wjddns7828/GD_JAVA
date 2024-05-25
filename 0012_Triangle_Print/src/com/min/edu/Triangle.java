package com.min.edu;

// print, println, 이중포문

public class Triangle {

	// 반복 횟수 0, 1 ,2 ,3 | 1, 2, 3, 4
	/**
	 * 1
	 * 11
	 * 111
	 * 1111
	 */
	public void triangle_One() {
		for(int i=0; i<4;i++) {
			for(int j = 0; j<(i+1); j++) {
				System.out.print("＊");
			}
			System.out.println();
		}
	}
	public void triangle_Two() {
		for(int i=0; i<4;i++) {
			for(int j = 0; j<(4-i); j++) {
				System.out.print("＊");
			}
			System.out.println();
		}
	}
	public void triangle_Three() {
		for(int i=0; i<4;i++) {
			for(int j = 0; j<(4-i-1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<(i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void triangle_four() {
		for(int i=0; i<4;i++) {
			
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<(4-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
