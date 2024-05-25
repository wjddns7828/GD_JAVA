package com.coffe.mechine;
/**
 * Menu 클래스의 Coffe를 선택 할 수 있는 Class
 * @author GDJ67
 * @since 23/04/21
 */
public class Select {
	/**
	 * 메뉴를 선택하여 해당선택 메뉴명을 반환하는 메소드
	 * @param num 선택된 메뉴 번호 int
	 * @return 선택된 메뉴명 String
	 */
	public String selectMenu(int num) {
		System.out.println("메뉴를 선택해 주세요");
		
		String chk = "";
		
		if(num == 1 ) {
			chk = Menu.m1;
		} else if(num == 2){
			chk = Menu.m2;
		} 
		
		return chk;
	}
}
