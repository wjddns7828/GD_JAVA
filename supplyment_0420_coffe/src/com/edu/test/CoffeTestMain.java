package com.edu.test;

import java.util.Scanner;

import com.coffe.mechine.CoffeVo;
import com.coffe.mechine.Menu;
import com.coffe.mechine.Money_mk;
import com.coffe.mechine.Select;
/**
 * 추가 수업에 커피자판기 테스트를 위한 클래스
 * @author GDJ67
 * @since 23/04/23
 * @version 1.b
 */
public class CoffeTestMain {
	/**
	 * 커피자판기의 Main 메소드
	 * @param args JVM에서 처음 입력하는 initial value
	 */

	public static void main(String[] args) {
		Menu m = new Menu();
		m.printMenu();
		
		System.out.println();
		System.out.println();

		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴에서 음료 선택");
		int n = scan.nextInt();
		
		Select s = new Select();
		String choiceMenu = s.selectMenu(n);
		System.out.println("선택하신 음료는:" + choiceMenu);
		
		System.out.println("금액을 입력해 주세요");
		int money = scan.nextInt();
//		Money cal = new Money();
//		cal.coffe_Cal(money);
//		System.out.println("커피 "+cal.getCup()+"잔이 나왔습니다");
//		System.out.println("잔돈은"+cal.getMoney()+"입니다");
		
		Money_mk mm = new Money_mk();
		CoffeVo result =mm.coffeOrder(money);
		result.coffePrint();
		
	}

}
