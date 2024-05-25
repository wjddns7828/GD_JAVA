package com.min.pri;

import java.util.Arrays;

public class BallMain {
	public static void main(String[] args) {
		RandomBox rb = new RandomBox(6); //입력 값의 index갯수 생성
		int cnt = 10;
		int[] testarr;
		testarr = new int [cnt];
		for (int i = 0; i < cnt; i++) {
			testarr[cnt++] = rb.inputRandomNum();
		}
		
	}
}
