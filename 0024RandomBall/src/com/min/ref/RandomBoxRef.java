package com.min.ref;

import java.util.Arrays;

public class RandomBoxRef {
	private BallOne[] box; //box라는 array생성
	
	
	public RandomBoxRef() {
		box = new BallOne[6]; //box라는 array에 index는 6개
	}

	public BallOne[] getBox() { //box가 private이기 때문에 box를 가져 갈 수있게 만듬
		return box; 
	}
	
	public void inputBallOne() {
		int idx = 0;
		while(true) {
			BallOne one = new BallOne();
			
			if(!checkBox(one)) {
				box[idx++] = one;
			}
			
			if (idx==box.length) {
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "RandomBoxRef [box=" + Arrays.toString(box) + "]";
	}
	
	
	private boolean checkBox(BallOne o) {
		boolean isc = false;
		for (int i = 0; i < box.length; i++) {
			if (box[i] != null && box[i].equals(o)) {
				isc=true;
				break;
			}
		}
		return isc;
	}
}
