package com.min.lotto;

import java.util.Arrays;
import java.util.Iterator;
//로또 번호에 대한 클래스
public class Lotto_Num {
	private int num;
	int [] lottoBox = new int[6];

	//로또 번호 부여
	public int[] lottoNum() {
		int idx = 0;
		while (true) {
			num = (int)(Math.random()*10)+1;
			if(!lottoChkNum(num)){
				lottoBox[idx++] = num;
			}
			if(idx==lottoBox.length) {
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
	public int[][] lottoBox(int[][] lottoArr) {
		for (int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = lottoNum().clone();
		}
		return lottoArr;
	}
	
}