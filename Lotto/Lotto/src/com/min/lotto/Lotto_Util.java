package com.min.lotto;

import java.util.Scanner;

public class Lotto_Util {
	Scanner scan = new Scanner(System.in);
	int money;
	public int Money_Scan() {//돈 받아오기
		while (true) {
			try {
				money = scan.nextInt();
				if(money<1000) {
					System.out.println("로또의 금액은 1000원 입니다. 금액이 부족합니다.");
				}else {
					return money;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력가능합니다.");
			} 
		}//while
	}
	
	
	public int numScan() {
		int a = scan.nextInt();
		return a;
	}
}
