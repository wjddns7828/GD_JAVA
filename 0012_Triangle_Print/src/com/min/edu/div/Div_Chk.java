package com.min.edu.div;

/**
 * TODO 003 비교하는 메소드
 * numA와 numB(A의 완전수)를 받아와서 numC(numB의 완전수)를 구하고 
 * numA와numC가 같을 시 맞다고 출력해주고 아닐 시 아니라고 출력해주는 메소드
 * */

public class Div_Chk {
//	public void Num_chk(int num0, int num2) { 
//		if (num0==num2) {
//			System.out.println("두 수는 친화수가 맞습니다.");
//		}else
//			System.out.println("두 수는 친화수가 아닙니다.");
//	}
	
	public boolean Num_chk(int num0, int num2, boolean chk) { 
			boolean ck = (num0==num2) ? true : false;
		return ck;
	}
}
