package com.coffe.mechine;

/**
 * 주문 결과를 담는 객체
 * @author GDJ67
 *
 */
public class CoffeVo {
	
	/**
	 * 잔돈을 저장하는 멤버필드
	 */
	private int money;
	
	/**
	 * 계산된 커피의 잔수를 저장하는 멤버필드
	 */
	private int cup;
	
	/**
	 * 맴버 필드를 입력 받는 오버로딩 된 생성자 
	 * @param money 외부에서 입력 받는 잔돈 (int값)
	 * @param cup 외부에서 입력받는 잔수 (int값)
	 */
	
	public CoffeVo(int money, int cup) {
		this.money = money;
		this.cup = cup;
	}
	public void coffePrint() {
		System.out.println("주문하신 커피"+cup+"잔 과 잔돈"+money+"입니다");
	}
	
	
}
