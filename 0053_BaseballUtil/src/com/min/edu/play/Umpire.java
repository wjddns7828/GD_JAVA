package com.min.edu.play;
/*
 * 생성된 pitcher와 hitter를 사용하여 strike와 ball을 판단하는 bean클래스
 * 
 */
public class Umpire {
	private int[] pball;
	private int[] hball;
//	private int boxLength;
//	public Umpire() {//체이닝
//		this(3);
//	}
//	public Umpire(int n) {
//		this.boxLength = n;
//		pball =new int[n];
//		hball = new int [n];
//	}
	
//	public Umpire(int[] pball, int[] hball) {
//		super();
//		this.pball=pball;
//		this.hball=hball;
//	}
	
	
	public void setPball(int[] pball) {
		this.pball = pball;
	}
	public void setHball(int[] hball) {
		this.hball = hball;
	}
	/**
	 * 맴버 필드의 pball과 hball을 판단하여 같은 Index와 같은 값을 판단하여 Count를 반환한다
	 */
	public int getStrike() {
		int cnt = 0;
		for (int i = 0; i < hball.length; i++) {
			if(pball[i]==hball[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	/**
	 * 맴버 필드의 pball과 hball을 판단하여 같은 Index는 다르지만 같은 값을 판단하여 Count를 반환한다
	 * @return 
	 */
	public int getBall() {
		int cnt =0;
		for (int i = 0; i < hball.length; i++) {
			for (int j = 0; j < hball.length; j++) {
				if(i != j && pball[i]==hball[j]) {
					cnt++;
				}
			}
		}
		return cnt;	
	}
}
