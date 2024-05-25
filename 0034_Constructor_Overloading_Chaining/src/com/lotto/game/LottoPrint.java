package com.lotto.game;

import java.util.Arrays;

public class LottoPrint {

	public static void main(String[] args) {
		System.out.println("한국로또는 default로 호출");
		LottoBox lbKor = new LottoBox();
		System.out.println(Arrays.toString(lbKor.getLottoRow()));
		System.out.println("미국로또는 argument를 입력하는 생성자로 호출");
		LottoBox lbUSA = new LottoBox(12);
		System.out.println(Arrays.toString(lbUSA.getLottoRow()));
	}

}
