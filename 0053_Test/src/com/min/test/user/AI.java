package com.min.test.user;

import java.util.Arrays;
import java.util.Iterator;

public class AI {
	
	int[] hands;
	
	public AI() {
		this(3);
	}
	public AI(int n) {
	 hands = new  int[n];
		Arrays.fill(hands, -1);
	}
	private void num() {
		int idx = 0;
		int n = hands.length;		
		while (idx!=n) {
			int num = makenum();
			if (!checkbox(num)) {
				hands[idx++] = num;
			}
		}
	}
	private int makenum() {
		return 	(int)(Math.random()*10)+1;
	}
	
	private boolean checkbox(int num) {
		boolean isc = false;
			for (int i = 0; i < hands.length; i++) {
				if(hands[i]==num) {
					isc = true;
					break;
				}
			}		
		return isc;
	}
	public int[] getHands() {
		return hands;
	}
	@Override
	public String toString() {
		return "AI [hands=" + Arrays.toString(hands) + "]";
		
		
	}
	
	
	
	
	
	
}
