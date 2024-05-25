package com.coffe.mechine;
/**
 * <B>mk</B>가 만든 커피 주문 클래스
 * @author GDJ67
 * @since 23/04/21
 */
public class Money_mk {
	/**
	 * 외부에서 입력받은 금액으로 1000원짜리 커피의 잔수와 잔돈을 계산하는 메소드
	 * @param money 입력 받은 금액(int)
	 * @return vo객체로 반환되며 VO객체는 잔돈과 잔수를 가지고 있음
	 */
	public CoffeVo coffeOrder(int money) {
		int cup = money/1000;
		int m = money%1000;
		CoffeVo vo = new CoffeVo(m,cup);
		return vo;
	}
	
}
