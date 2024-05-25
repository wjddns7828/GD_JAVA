package com.min.lotto.test;

import java.util.Arrays;

public class TestNum {

	private int num;
	int [] lottoBox = new int[6];

	public void lottoBox() {

	}
	//로또 번호 부여
	public int[] lottoNum() {
		int idx = 0;
		while (true) {
			num = (int)(Math.random()*45)+1;
			if(!lottoChkNum(num)){
				lottoBox[idx++] = num;
			}
			if(idx==lottoBox.length) {
				Arrays.sort(lottoBox);
//				System.out.println(Arrays.toString(lottoBox));
				break;
			}
		}
		return lottoBox;
	}
	//로또 중복 확인
	public boolean lottoChkNum(int num) {
		boolean isc = false;
		for (int i = 0; i < lottoBox.length; i++) {
			if(lottoBox[i]==num && lottoBox[i] != 0) {
				isc =true;
				break;
			}
		}
		return isc;
	}
	
	public boolean isValueInArray(int[][] arr, int value) {
		for (int[] row : arr) {
			for (int num : row) {
				if (num == value) {
					return true;
				}
			}
		}
		return false;
	}
}
