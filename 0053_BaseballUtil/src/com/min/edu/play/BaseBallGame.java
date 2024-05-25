package com.min.edu.play;
/*
 *	게임의 전반적인 생성과 판단 종료<br> 
 *
 *
 */

import java.util.Scanner;

import com.edu.util.DefineUtil;
import com.min.edu.comm.BaseBallConst;
import com.min.edu.user.Hitter;
import com.min.edu.user.Pitcher;

public class BaseBallGame {
	private int len; // 전체적인 게임의 배열의 길이
	private Pitcher pBox;//컴퓨터 숫자를 생성하고 가지고 있는 클래스
	private Hitter hBox; // 사용자가 숫자를 입력하는 클래스
	private Umpire ump;//판단하는 객체
	
	private static BaseBallGame instance;
	public static BaseBallGame getInstance(int n) {
		if(instance==null) {
			instance = new BaseBallGame(n);
		}
		return instance;
	}
	
	public void newGame() {
		String ans;
		do {
			play();
			ans = DefineUtil.getAnswer("게임을 다시 시작하시겠습니까? [Y/N]");
			if(ans.equalsIgnoreCase("N")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		} while (ans.equalsIgnoreCase("Y"));
		
	}
	
//	private BaseBallGame() {
//		this(3);
//	}
	private BaseBallGame(int n) {
		this.len =n;
		this.pBox = new Pitcher(n);
		this.hBox = new Hitter(n);
		this.ump =  new Umpire();
	}
	
	
	private void play() {
		int num =0;
		int strike =0;
		int ball = 0;
		
		//자동 번호 생성
		pBox.make();
//		pBox.print(pBox.getBox());//출력 테스트
		
		ump.setPball(pBox.getBox());
		
		while (num != BaseBallConst.ITERATOR) {
			num ++;
			System.out.println("현재 남은 게임의 횟수 : " + (BaseBallConst.ITERATOR-num));
			
			hBox.make();
			System.out.println("사용자가 입력 한 숫자는 : "+hBox.toString());
			ump.setHball(hBox.getBox());
			
			strike = ump.getStrike();
			ball = ump.getBall();
			
			System.out.printf("당신의 결과 Strike : %d / Ball: %d\n",strike,ball);
			
			if(strike == BaseBallConst.STRIKE) {
				System.out.println("당신은 노스트라다무스 입니다. 축하해요");
				break;
			}else {
				System.out.println("당신의 예측은 틀렸습니다.");
				System.out.printf("Pitcher의 숫자는 %s \n", pBox.toString());
			}
			
			
		}
	}
}

