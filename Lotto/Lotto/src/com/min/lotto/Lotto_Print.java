package com.min.lotto;

import java.util.Arrays;
import java.util.Iterator;

public class Lotto_Print {
	Lotto_Util lu = new Lotto_Util();
	
	public int money() {
		//돈 입력 및 출력
		System.out.println("금액을 입력하세요. : ");
		int money = lu.Money_Scan();
		return money;
	}
	
	public void lottoCnt_Print(int a) {
		System.out.printf("로또 %d 개를 구입하셨습니다.\n",a);
	}

	public void lottoChange_Print(int a) {
		System.out.printf("잔돈 %d 원\n",a);
	}
	
	//오늘 날짜 출력
	public void todayPrint(int[] today) {
		System.out.printf("발 행 일 : %d %02d %02d",today[0],today[1],today[2]);
	}
	
	//오늘 요일 츨력
	public void dayOfWeekPrint(String a) {
		System.out.printf("    (%s)    ",a);
	}
	public void time (int[] time){
		System.out.printf("%02d:%02d:%02d\n",time[0],time[1],time[2]);
	}

	//추첨일 출력
	public void satDate(int a,int[] today) {
		if(a!=7) {
			today[2]+=a;
		}
		System.out.printf("지 급 일 : %02d %02d %02d",today[0],today[1],today[2]);
	}

	public void lottoNum(int[][] lotto) {
		for (int i = 0; i < lotto.length; i++){
//			Arrays.sort(lotto[i]);
			System.out.println(Arrays.toString(lotto[i]));
		}
	}
}

