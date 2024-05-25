package com.lotto.game;

//한 줄 (6개)의 랜덤 번호를 가지고 있는 Array
//한국은 6개가 lotto
//미국의 super ball 은 17개
public class LottoBox {
	
	private int [] lottoRow;
	
	public LottoBox() {
		this(6);
	}

	public LottoBox(int cel) {
		lottoRow = new int [cel];
		
	}

	public int[] getLottoRow() {
		return lottoRow;
	}
	
	
}
