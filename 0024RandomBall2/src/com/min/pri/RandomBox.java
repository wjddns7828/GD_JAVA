package com.min.pri;

import java.util.Arrays;

public class RandomBox {
	
//입력만되고 한번만 가져 갈 수있게
	private  int[] balls;
	
	//array 크기 조정
	public RandomBox(int n) {
		balls = new int[n];
		inputRandomNum();
	}
	//get메소드
	public int[] getBalls() {
		return balls;
	}
	@Override
	public String toString() {
		return "RandomBox [balls=" + Arrays.toString(balls) + "]";
	}
	
	
	public void inputRandomNum() {
		int idx= 0;
		while(true) {
			int num = (int)(Math.random()*45)+1;
			if(!chkNum(num)) {
				balls[idx++] = num;
			}
			if(idx==balls.length) {
				break;
			}
		}
	}
	
	private boolean chkNum(int num) {
		boolean isc = false;
			for (int i = 0; i < balls.length; i++) {
				if(balls[i] == num) {
					isc =true;
					break;
				}
			}
		return isc;
	}
	
}