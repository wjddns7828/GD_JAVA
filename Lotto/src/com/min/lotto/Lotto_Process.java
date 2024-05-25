package com.min.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto_Process {

	Lotto_Fn lf = new Lotto_Fn();
	Lotto_Num ln = new Lotto_Num();
	Lotto_Print lp = new Lotto_Print();
	Lotto_DTO ld = new Lotto_DTO();
	Lotto_Util lu = new Lotto_Util();
	public void Process() {

		//돈 입력 및 출력
		int money = lp.money();
		//로또 갯수 출력
		int lottoCnt = lf.LottoCnt(money);
		lp.lottoCnt_Print(lottoCnt);
		
		// ld.lotto [로또의 수][로또 번호는 6개 고정]로 초기화
		ld.lotto = new int [lottoCnt][6];
		//로또 자동 값 넣어주기
		ld.lotto = ln.lottoBox(ld.lotto);
		
		//로또 수동 값 넣어주기
		ld.lotto = lf.userInput(ld.lotto);
		
		//로또 중복 값 제거해주기
//		ld.lotto = lf.checkNum(ld.lotto);
		
		//로또 출력
		lp.lottoNum(ld.lotto);
		
		
		//로또 잔돈 출력
		int lottoChange = lf.lottoChange(money);
		lp.lottoChange_Print(lottoChange);
		//오늘 날짜 출력
		lp.todayPrint(ld.today);
		//오늘 요일 출력 
		lp.dayOfWeekPrint(lf.y(ld.y));
		//현재 시각 출력
		lp.time(ld.time);
		//토요일 날짜 출력
		lp.satDate(lf.sat(),ld.today);
				
	}
}
