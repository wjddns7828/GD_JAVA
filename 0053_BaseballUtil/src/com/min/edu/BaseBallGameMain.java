package com.min.edu;

import java.util.Arrays;

import com.edu.util.DefineUtil;
import com.min.edu.play.BaseBallGame;
import com.min.edu.play.Umpire;
import com.min.edu.user.Hitter;
import com.min.edu.user.Pitcher;

public class BaseBallGameMain {

	public static void main(String[] args) {
		//TODO 001 JAR파일 라이브러리 생성 및 테스트
//		System.out.println(DefineUtil.getNum());
//		System.out.println(DefineUtil.getString());
		
		//TODO 002 Pitcher 클래스의 메소드 테스트
//		Pitcher p = new Pitcher();
		//makeNum과 checkBox 테스트
//		int num = p.makenum();
//		System.out.println(num);
//		boolean isc = p.checkBox(num);
//		System.out.println(isc);
//		boolean isc1 = p.checkBox(-1);
//		System.out.println(isc1);
		//make Test
//		p.make();
//		int[] pitcherBox = p.getBox();
//		System.out.println(Arrays.toString(pitcherBox));
//		System.out.println(p);
//		p.print();
		
		
		//TODO 003 Hitter 클래스의 메소드 테스트
//		Hitter h = new Hitter();
//		boolean isc = h.checkArray();
//		System.out.println(isc);
		
		//입력 값을 정수 3개만 받고 정수로 변경(정규화 사용)시켜서 Array에 넣는 테스트
//		int[] testBox =h.makeNum();
//		System.out.println(Arrays.toString(testBox));
		
//		h.make();
//		int[] box = h.getBox();
//		h.print(box);
		
		//TODO 004 비교 클래스 테스트
//		Umpire u = new Umpire();
//		int[] h = {4,2,3};
//		int[] p = {4,5,6};
//		
//		
//		Umpire u = new Umpire();
//		u.setPball(p);
//		u.setHball(h);
//		
//		int strike = u.getStrike();
//		int ball = u.getBall();
//		
//		System.out.printf("스트라이크 갯수 %d / 볼의 갯수 %d \n",strike,ball);
		
		//TODO 005 플레이 테스트
//		BaseBallGame bg = new BaseBallGame();
//		bg.play();
		
		//TODO 006 라이브러리 테스트트트
//		String ans = DefineUtil.getAnswer("게임을 다시 시작하시겠습니까?(Y/N)");
//		System.out.println(ans);
		
		//TODO 007 숫자야구게임 완료 테스트(시나리오 테스트)
//		System.out.println("게임의 크기를 선택 해 주세요");
//		int gameKind = DefineUtil.getNum();
//		BaseBallGame game = new BaseBallGame(3);	
//		game.newGame();
		
		//TODO 008 SingleTon 적용
		System.out.println("게임의 크기를 선택 해 주세요");
		int gameKind = DefineUtil.getNum();
		BaseBallGame game = BaseBallGame.getInstance(gameKind);
		game.newGame();
	}

}
