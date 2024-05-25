package com.coffe.mechine;
/**
 * 커피자판기에서 사용하는 메뉴들이 있는 클래스 <br>
 * 메뉴를 출력해주는 기능을 가짐
 * @author GDJ67
 * @since 23/04/21
 */
public class Menu {
	/**
	 * 첫번째 메뉴인 BlackCoffe 의 값을 고정으로 가지고 있는 static 상수
	 */
	public static final String m1 = "blackcoffe";
	/**
	 * 두번째 메뉴인 americano 의 값을 고정으로 가지고 있는 static 상수
	 */
	public static final String m2 = "americano";
	
	/**
	 * Menu Class가 가지고 있는 맴버 필드의 값을 출력해주는 Method
	 */
	
	public void printMenu() {
		System.out.println("주문 가능한 메뉴");
		System.out.println("1번 메뉴" +m1);
		System.out.println("2번 메뉴" +m2);
		System.out.println("끝");
	}
}
