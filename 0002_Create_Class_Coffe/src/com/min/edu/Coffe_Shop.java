package com.min.edu;

//TODO 002 커피주문을 받고 출력을 해주는 클래스
/**
 * 
 * @author LJW
 * @since 2023-04-19
 * 커피주문을 입력받아 커피를 출력하는 클래스
 *
 */
public class Coffe_Shop {
	/**
	 * 사용자가 외부에서 객체를 생성하여 커피주문서를 입력하는 메소드
	 * @param order 사용자가 커피 종류 및 잔수를 가지고 있는 객체
	 * @return 같은 클래스의 private 메소드를 실행하여 받은 결과물
	 */
	public String orderstaff(Coffe_Bill order) {// 주문서를 받아서
		String result = makestaff(order); //주문서를 makestaff에게 던저준다
		return result;
	}
	/**
	 * private 외부에서 보이지 않는 Class에 속해있는 메소드
	 * @param re는 커피 주문서 객체
	 * @return 연산된 결과
	 */
	private String makestaff(Coffe_Bill re) {
		String n = re.coffe; 
		int m = re.cup;
		return "주문하신 커피는 "+n+"잔수는"+m+"주문하신 커피 나왔습니다.";
	}
}
