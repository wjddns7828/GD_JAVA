package com.min.pri;

import java.util.Arrays;

public class BallMain {
	public static void main(String[] args) {
		RandomBox rb = new RandomBox(6); //입력 값의 index갯수 생성
		System.out.println(rb);
		int[] gball = rb.getBalls();
//		System.out.println(Arrays.toString(gball));
	}
}
